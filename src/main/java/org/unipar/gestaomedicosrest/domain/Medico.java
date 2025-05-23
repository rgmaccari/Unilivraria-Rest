package org.unipar.gestaomedicosrest.domain;

import org.unipar.gestaomedicosrest.dto.CadastroMedicoDTO;
import org.unipar.gestaomedicosrest.dto.UpdateMedicoDto;


public class Medico {

    private Integer id;
    private String nome;
    private String email;
    private Long telefone;
    private String crm;
    private String especialidade;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String complemento;
    private String cidade;
    private boolean ativo;

    public Medico() { }

    public Medico(CadastroMedicoDTO medicoInsertRequestDTO) {
        this.id = id;
        this.nome = medicoInsertRequestDTO.getNome();
        this.email = medicoInsertRequestDTO.getEmail();
        this.telefone = medicoInsertRequestDTO.getTelefone();
        this.crm = medicoInsertRequestDTO.getCrm();
        this.especialidade = medicoInsertRequestDTO.getEspecialidade();
        this.logradouro = medicoInsertRequestDTO.getLogradouro();
        this.bairro = medicoInsertRequestDTO.getBairro();
        this.cidade = medicoInsertRequestDTO.getCidade();
        this.numero = medicoInsertRequestDTO.getNumero();
        this.complemento = medicoInsertRequestDTO.getComplemento();
        this.ativo = true;
    }

    public Medico(Integer id, UpdateMedicoDto dto){
        this.id = id;
        this.nome = dto.getNome();
        this.telefone = dto.getTelefone();
        this.logradouro = dto.getLogradouro();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
















