/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlayErrorCodeSumInfoListResponse  extends AbstractModel{

    /**
    * 分省份分运营商错误码为4或5开头的状态码数据信息。
    */
    @SerializedName("ProIspInfoList")
    @Expose
    private ProIspPlayCodeDataInfo [] ProIspInfoList;

    /**
    * 所有状态码的加和的次数。
    */
    @SerializedName("TotalCodeAll")
    @Expose
    private Integer TotalCodeAll;

    /**
    * 状态码为4开头的总次数。
    */
    @SerializedName("TotalCode4xx")
    @Expose
    private Integer TotalCode4xx;

    /**
    * 状态码为5开头的总次数。
    */
    @SerializedName("TotalCode5xx")
    @Expose
    private Integer TotalCode5xx;

    /**
    * 各状态码的总次数。
    */
    @SerializedName("TotalCodeList")
    @Expose
    private PlayCodeTotalInfo [] TotalCodeList;

    /**
    * 页号。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页大小。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Integer TotalPage;

    /**
    * 总记录数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Integer TotalNum;

    /**
    * 状态码为2开头的总次数。
    */
    @SerializedName("TotalCode2xx")
    @Expose
    private Integer TotalCode2xx;

    /**
    * 状态码为3开头的总次数。
    */
    @SerializedName("TotalCode3xx")
    @Expose
    private Integer TotalCode3xx;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取分省份分运营商错误码为4或5开头的状态码数据信息。
     * @return ProIspInfoList 分省份分运营商错误码为4或5开头的状态码数据信息。
     */
    public ProIspPlayCodeDataInfo [] getProIspInfoList() {
        return this.ProIspInfoList;
    }

    /**
     * 设置分省份分运营商错误码为4或5开头的状态码数据信息。
     * @param ProIspInfoList 分省份分运营商错误码为4或5开头的状态码数据信息。
     */
    public void setProIspInfoList(ProIspPlayCodeDataInfo [] ProIspInfoList) {
        this.ProIspInfoList = ProIspInfoList;
    }

    /**
     * 获取所有状态码的加和的次数。
     * @return TotalCodeAll 所有状态码的加和的次数。
     */
    public Integer getTotalCodeAll() {
        return this.TotalCodeAll;
    }

    /**
     * 设置所有状态码的加和的次数。
     * @param TotalCodeAll 所有状态码的加和的次数。
     */
    public void setTotalCodeAll(Integer TotalCodeAll) {
        this.TotalCodeAll = TotalCodeAll;
    }

    /**
     * 获取状态码为4开头的总次数。
     * @return TotalCode4xx 状态码为4开头的总次数。
     */
    public Integer getTotalCode4xx() {
        return this.TotalCode4xx;
    }

    /**
     * 设置状态码为4开头的总次数。
     * @param TotalCode4xx 状态码为4开头的总次数。
     */
    public void setTotalCode4xx(Integer TotalCode4xx) {
        this.TotalCode4xx = TotalCode4xx;
    }

    /**
     * 获取状态码为5开头的总次数。
     * @return TotalCode5xx 状态码为5开头的总次数。
     */
    public Integer getTotalCode5xx() {
        return this.TotalCode5xx;
    }

    /**
     * 设置状态码为5开头的总次数。
     * @param TotalCode5xx 状态码为5开头的总次数。
     */
    public void setTotalCode5xx(Integer TotalCode5xx) {
        this.TotalCode5xx = TotalCode5xx;
    }

    /**
     * 获取各状态码的总次数。
     * @return TotalCodeList 各状态码的总次数。
     */
    public PlayCodeTotalInfo [] getTotalCodeList() {
        return this.TotalCodeList;
    }

    /**
     * 设置各状态码的总次数。
     * @param TotalCodeList 各状态码的总次数。
     */
    public void setTotalCodeList(PlayCodeTotalInfo [] TotalCodeList) {
        this.TotalCodeList = TotalCodeList;
    }

    /**
     * 获取页号。
     * @return PageNum 页号。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置页号。
     * @param PageNum 页号。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页大小。
     * @return PageSize 每页大小。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页大小。
     * @param PageSize 每页大小。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 获取总页数。
     * @return TotalPage 总页数。
     */
    public Integer getTotalPage() {
        return this.TotalPage;
    }

    /**
     * 设置总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Integer TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * 获取总记录数。
     * @return TotalNum 总记录数。
     */
    public Integer getTotalNum() {
        return this.TotalNum;
    }

    /**
     * 设置总记录数。
     * @param TotalNum 总记录数。
     */
    public void setTotalNum(Integer TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * 获取状态码为2开头的总次数。
     * @return TotalCode2xx 状态码为2开头的总次数。
     */
    public Integer getTotalCode2xx() {
        return this.TotalCode2xx;
    }

    /**
     * 设置状态码为2开头的总次数。
     * @param TotalCode2xx 状态码为2开头的总次数。
     */
    public void setTotalCode2xx(Integer TotalCode2xx) {
        this.TotalCode2xx = TotalCode2xx;
    }

    /**
     * 获取状态码为3开头的总次数。
     * @return TotalCode3xx 状态码为3开头的总次数。
     */
    public Integer getTotalCode3xx() {
        return this.TotalCode3xx;
    }

    /**
     * 设置状态码为3开头的总次数。
     * @param TotalCode3xx 状态码为3开头的总次数。
     */
    public void setTotalCode3xx(Integer TotalCode3xx) {
        this.TotalCode3xx = TotalCode3xx;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ProIspInfoList.", this.ProIspInfoList);
        this.setParamSimple(map, prefix + "TotalCodeAll", this.TotalCodeAll);
        this.setParamSimple(map, prefix + "TotalCode4xx", this.TotalCode4xx);
        this.setParamSimple(map, prefix + "TotalCode5xx", this.TotalCode5xx);
        this.setParamArrayObj(map, prefix + "TotalCodeList.", this.TotalCodeList);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalCode2xx", this.TotalCode2xx);
        this.setParamSimple(map, prefix + "TotalCode3xx", this.TotalCode3xx);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

