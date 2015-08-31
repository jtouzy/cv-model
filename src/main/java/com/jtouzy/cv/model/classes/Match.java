package com.jtouzy.cv.model.classes;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import com.jtouzy.dao.annotations.DAOTable;
import com.jtouzy.dao.annotations.DAOTableField;
import com.jtouzy.dao.annotations.DAOTableRelation;
import com.jtouzy.dao.db.DBType;

@DAOTable(tableName = "mat")
public class Match {
	@DAOTableField(id = true, autoGenerated = true, name = "nummat", type = DBType.INTEGER)
	private Integer identifier;
	@DAOTableRelation(
		column = @DAOTableField(name = "chpmat", type = DBType.INTEGER),
		relationColumn = "numchp"
	)
	@NotNull(message = "Le championnat doit être renseigné")
	private Championship championship;
	@DAOTableField(name = "etpmat", type = DBType.INTEGER)
	@NotNull(message = "L'étape doit être renseignée")
	private Integer step;
	@DAOTableField(name = "ordmat", type = DBType.INTEGER)
	private Integer order;
	@DAOTableRelation(
		column = @DAOTableField(name = "eq1mat", type = DBType.INTEGER),
		relationColumn = "numeqi"
	)
	@NotNull(message = "L'équipe à domicile doit être renseignée")
	private Team firstTeam;
	@DAOTableRelation(
		column = @DAOTableField(name = "eq2mat", type = DBType.INTEGER),
		relationColumn = "numeqi"
	)
	@NotNull(message = "L'équipe à l'extérieur doit être renseignée")
	private Team secondTeam;
	@DAOTableField(name = "datmat", type = DBType.DATETIME)
	private LocalDateTime date;
	@DAOTableField(name = "stamat", type = DBType.ENUM)
	@NotNull(message = "L'état doit être renseigné")
	private Match.State state;
	@DAOTableRelation(
		column = @DAOTableField(name = "estmat", type = DBType.INTEGER),
		relationColumn = "numeqi"
	)
	private Team scoreSettingTeam;
	@DAOTableField(name = "format", type = DBType.BOOLEAN)
	@NotNull(message = "La zone 'Forfait' doit être renseignée")
	private Boolean forfeit;
	@DAOTableField(name = "sc1mat", type = DBType.INTEGER)
	private Integer sc1;
	@DAOTableField(name = "sc2mat", type = DBType.INTEGER)
	private Integer sc2;
	@DAOTableField(name = "s11mat", type = DBType.INTEGER)
	private Integer s11;
	@DAOTableField(name = "s12mat", type = DBType.INTEGER)
	private Integer s12;
	@DAOTableField(name = "s21mat", type = DBType.INTEGER)
	private Integer s21;
	@DAOTableField(name = "s22mat", type = DBType.INTEGER)
	private Integer s22;
	@DAOTableField(name = "s31mat", type = DBType.INTEGER)
	private Integer s31;
	@DAOTableField(name = "s32mat", type = DBType.INTEGER)
	private Integer s32;
	@DAOTableField(name = "s41mat", type = DBType.INTEGER)
	private Integer s41;
	@DAOTableField(name = "s42mat", type = DBType.INTEGER)
	private Integer s42;
	@DAOTableField(name = "s51mat", type = DBType.INTEGER)
	private Integer s51;
	@DAOTableField(name = "s52mat", type = DBType.INTEGER)
	private Integer s52;
	
	public Integer getIdentifier() {
		return identifier;
	}
	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}
	public Championship getChampionship() {
		return championship;
	}
	public void setChampionship(Championship championship) {
		this.championship = championship;
	}
	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Team getFirstTeam() {
		return firstTeam;
	}
	public void setFirstTeam(Team firstTeam) {
		this.firstTeam = firstTeam;
	}
	public Team getSecondTeam() {
		return secondTeam;
	}
	public void setSecondTeam(Team secondTeam) {
		this.secondTeam = secondTeam;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public Match.State getState() {
		return state;
	}
	public void setState(Match.State state) {
		this.state = state;
	}
	public Team getScoreSettingTeam() {
		return scoreSettingTeam;
	}
	public void setScoreSettingTeam(Team scoreSettingTeam) {
		this.scoreSettingTeam = scoreSettingTeam;
	}
	public Boolean isForfeit() {
		return forfeit;
	}
	public void setForfeit(Boolean forfeit) {
		this.forfeit = forfeit;
	}
	public Integer getSc1() {
		return sc1;
	}
	public void setSc1(Integer sc1) {
		this.sc1 = sc1;
	}
	public Integer getSc2() {
		return sc2;
	}
	public void setSc2(Integer sc2) {
		this.sc2 = sc2;
	}
	public Integer getS11() {
		return s11;
	}
	public void setS11(Integer s11) {
		this.s11 = s11;
	}
	public Integer getS12() {
		return s12;
	}
	public void setS12(Integer s12) {
		this.s12 = s12;
	}
	public Integer getS21() {
		return s21;
	}
	public void setS21(Integer s21) {
		this.s21 = s21;
	}
	public Integer getS22() {
		return s22;
	}
	public void setS22(Integer s22) {
		this.s22 = s22;
	}
	public Integer getS31() {
		return s31;
	}
	public void setS31(Integer s31) {
		this.s31 = s31;
	}
	public Integer getS32() {
		return s32;
	}
	public void setS32(Integer s32) {
		this.s32 = s32;
	}
	public Integer getS41() {
		return s41;
	}
	public void setS41(Integer s41) {
		this.s41 = s41;
	}
	public Integer getS42() {
		return s42;
	}
	public void setS42(Integer s42) {
		this.s42 = s42;
	}
	public Integer getS51() {
		return s51;
	}
	public void setS51(Integer s51) {
		this.s51 = s51;
	}
	public Integer getS52() {
		return s52;
	}
	public void setS52(Integer s52) {
		this.s52 = s52;
	}

	public enum State {
		C, S, V, R, F
	}	
}
