package com.example;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BancoService {

    @Results({
            @Result(property = "nome", column = "torg_nome"),
            @Result(property = "id", column = "torg_seq")
    })

    @Select("SELECT TORG_NOME FROM TB_ORGAO")
    List<String> findNomeOrgao();

    @Select("SELECT TORG_SEQ FROM TB_ORGAO")
    List<String> findIdOrgao();

    @Select("SELECT TORG_SEQ FROM TB_ORGAO WHERE TORG_NOME = #{nome}")
    int findIdOrgaoByName(String nome);

    @Select("SELECT TCOD_NOME FROM TB_CONJUNTO_DADOS WHERE TORG_SEQ = #{id}")
    List<String> findNameConjunto(int id);

    @Select("SELECT TCOD_NOME FROM TB_CONJUNTO_DADOS WHERE TCOD_SEQ = 1")
    String findTitulo();

    @Select("SELECT TCOD_JSON FROM TB_CONJUNTO_DADOS WHERE TCOD_SEQ = 1")
    String findJson();

    @Select("SELECT TCOD_DATASET FROM TB_CONJUNTO_DADOS WHERE TCOD_SEQ = 1")
    String findDataset();

}
