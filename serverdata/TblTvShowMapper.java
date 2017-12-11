package com.poobo.sysmanage.tvshow.mapper;

import com.poobo.frame.mapper.BaseMapper;
import com.poobo.sysmanage.member.model.TblAuthInfo;
import com.poobo.sysmanage.tvshow.model.TblTvShow;
import com.poobo.sysmanage.tvshow.model.TblTvShowExample;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TblTvShowMapper  extends BaseMapper<TblTvShow, String>{
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    long countByExample(TblTvShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int deleteByExample(TblTvShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int deleteByPrimaryKey(String pkGlobalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int insert(TblTvShow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int insertSelective(TblTvShow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    List<TblTvShow> selectByExample(TblTvShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    TblTvShow selectByPrimaryKey(String pkGlobalId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int updateByExampleSelective(@Param("record") TblTvShow record, @Param("example") TblTvShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int updateByExample(@Param("record") TblTvShow record, @Param("example") TblTvShowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(TblTvShow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tv_show
     *
     * @mbg.generated Thu Dec 07 22:01:33 GMT+08:00 2017
     */
    int updateByPrimaryKey(TblTvShow record);
    
    List<String> getList();
    Map<String, Object> getRecord(String date);
}