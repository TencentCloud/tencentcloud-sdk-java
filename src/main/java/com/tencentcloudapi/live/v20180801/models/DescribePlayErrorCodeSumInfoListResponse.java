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

public class DescribePlayErrorCodeSumInfoListResponse extends AbstractModel{

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
    private Long TotalCodeAll;

    /**
    * 状态码为4开头的总次数。
    */
    @SerializedName("TotalCode4xx")
    @Expose
    private Long TotalCode4xx;

    /**
    * 状态码为5开头的总次数。
    */
    @SerializedName("TotalCode5xx")
    @Expose
    private Long TotalCode5xx;

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
    private Long PageNum;

    /**
    * 每页大小。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Long TotalPage;

    /**
    * 总记录数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 状态码为2开头的总次数。
    */
    @SerializedName("TotalCode2xx")
    @Expose
    private Long TotalCode2xx;

    /**
    * 状态码为3开头的总次数。
    */
    @SerializedName("TotalCode3xx")
    @Expose
    private Long TotalCode3xx;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 分省份分运营商错误码为4或5开头的状态码数据信息。 
     * @return ProIspInfoList 分省份分运营商错误码为4或5开头的状态码数据信息。
     */
    public ProIspPlayCodeDataInfo [] getProIspInfoList() {
        return this.ProIspInfoList;
    }

    /**
     * Set 分省份分运营商错误码为4或5开头的状态码数据信息。
     * @param ProIspInfoList 分省份分运营商错误码为4或5开头的状态码数据信息。
     */
    public void setProIspInfoList(ProIspPlayCodeDataInfo [] ProIspInfoList) {
        this.ProIspInfoList = ProIspInfoList;
    }

    /**
     * Get 所有状态码的加和的次数。 
     * @return TotalCodeAll 所有状态码的加和的次数。
     */
    public Long getTotalCodeAll() {
        return this.TotalCodeAll;
    }

    /**
     * Set 所有状态码的加和的次数。
     * @param TotalCodeAll 所有状态码的加和的次数。
     */
    public void setTotalCodeAll(Long TotalCodeAll) {
        this.TotalCodeAll = TotalCodeAll;
    }

    /**
     * Get 状态码为4开头的总次数。 
     * @return TotalCode4xx 状态码为4开头的总次数。
     */
    public Long getTotalCode4xx() {
        return this.TotalCode4xx;
    }

    /**
     * Set 状态码为4开头的总次数。
     * @param TotalCode4xx 状态码为4开头的总次数。
     */
    public void setTotalCode4xx(Long TotalCode4xx) {
        this.TotalCode4xx = TotalCode4xx;
    }

    /**
     * Get 状态码为5开头的总次数。 
     * @return TotalCode5xx 状态码为5开头的总次数。
     */
    public Long getTotalCode5xx() {
        return this.TotalCode5xx;
    }

    /**
     * Set 状态码为5开头的总次数。
     * @param TotalCode5xx 状态码为5开头的总次数。
     */
    public void setTotalCode5xx(Long TotalCode5xx) {
        this.TotalCode5xx = TotalCode5xx;
    }

    /**
     * Get 各状态码的总次数。 
     * @return TotalCodeList 各状态码的总次数。
     */
    public PlayCodeTotalInfo [] getTotalCodeList() {
        return this.TotalCodeList;
    }

    /**
     * Set 各状态码的总次数。
     * @param TotalCodeList 各状态码的总次数。
     */
    public void setTotalCodeList(PlayCodeTotalInfo [] TotalCodeList) {
        this.TotalCodeList = TotalCodeList;
    }

    /**
     * Get 页号。 
     * @return PageNum 页号。
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 页号。
     * @param PageNum 页号。
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 每页大小。 
     * @return PageSize 每页大小。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页大小。
     * @param PageSize 每页大小。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 总页数。 
     * @return TotalPage 总页数。
     */
    public Long getTotalPage() {
        return this.TotalPage;
    }

    /**
     * Set 总页数。
     * @param TotalPage 总页数。
     */
    public void setTotalPage(Long TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * Get 总记录数。 
     * @return TotalNum 总记录数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 总记录数。
     * @param TotalNum 总记录数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * Get 状态码为2开头的总次数。 
     * @return TotalCode2xx 状态码为2开头的总次数。
     */
    public Long getTotalCode2xx() {
        return this.TotalCode2xx;
    }

    /**
     * Set 状态码为2开头的总次数。
     * @param TotalCode2xx 状态码为2开头的总次数。
     */
    public void setTotalCode2xx(Long TotalCode2xx) {
        this.TotalCode2xx = TotalCode2xx;
    }

    /**
     * Get 状态码为3开头的总次数。 
     * @return TotalCode3xx 状态码为3开头的总次数。
     */
    public Long getTotalCode3xx() {
        return this.TotalCode3xx;
    }

    /**
     * Set 状态码为3开头的总次数。
     * @param TotalCode3xx 状态码为3开头的总次数。
     */
    public void setTotalCode3xx(Long TotalCode3xx) {
        this.TotalCode3xx = TotalCode3xx;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
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

