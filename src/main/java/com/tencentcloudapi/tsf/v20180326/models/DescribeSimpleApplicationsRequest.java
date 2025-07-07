/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSimpleApplicationsRequest extends AbstractModel {

    /**
    * 应用ID列表
    */
    @SerializedName("ApplicationIdList")
    @Expose
    private String [] ApplicationIdList;

    /**
    * 应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 微服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 资源类型数组
    */
    @SerializedName("ApplicationResourceTypeList")
    @Expose
    private String [] ApplicationResourceTypeList;

    /**
    * 通过id和name进行关键词过滤
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 无
    */
    @SerializedName("DisableProgramAuthCheck")
    @Expose
    private Boolean DisableProgramAuthCheck;

    /**
    * 查询指定微服务类型的应用列表
    */
    @SerializedName("MicroserviceTypeList")
    @Expose
    private String [] MicroserviceTypeList;

    /**
     * Get 应用ID列表 
     * @return ApplicationIdList 应用ID列表
     */
    public String [] getApplicationIdList() {
        return this.ApplicationIdList;
    }

    /**
     * Set 应用ID列表
     * @param ApplicationIdList 应用ID列表
     */
    public void setApplicationIdList(String [] ApplicationIdList) {
        this.ApplicationIdList = ApplicationIdList;
    }

    /**
     * Get 应用类型 
     * @return ApplicationType 应用类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
     * @param ApplicationType 应用类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 起始偏移量 
     * @return Offset 起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 起始偏移量
     * @param Offset 起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 微服务类型 
     * @return MicroserviceType 微服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 微服务类型
     * @param MicroserviceType 微服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 资源类型数组 
     * @return ApplicationResourceTypeList 资源类型数组
     */
    public String [] getApplicationResourceTypeList() {
        return this.ApplicationResourceTypeList;
    }

    /**
     * Set 资源类型数组
     * @param ApplicationResourceTypeList 资源类型数组
     */
    public void setApplicationResourceTypeList(String [] ApplicationResourceTypeList) {
        this.ApplicationResourceTypeList = ApplicationResourceTypeList;
    }

    /**
     * Get 通过id和name进行关键词过滤 
     * @return SearchWord 通过id和name进行关键词过滤
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 通过id和name进行关键词过滤
     * @param SearchWord 通过id和name进行关键词过滤
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get 无 
     * @return DisableProgramAuthCheck 无
     */
    public Boolean getDisableProgramAuthCheck() {
        return this.DisableProgramAuthCheck;
    }

    /**
     * Set 无
     * @param DisableProgramAuthCheck 无
     */
    public void setDisableProgramAuthCheck(Boolean DisableProgramAuthCheck) {
        this.DisableProgramAuthCheck = DisableProgramAuthCheck;
    }

    /**
     * Get 查询指定微服务类型的应用列表 
     * @return MicroserviceTypeList 查询指定微服务类型的应用列表
     */
    public String [] getMicroserviceTypeList() {
        return this.MicroserviceTypeList;
    }

    /**
     * Set 查询指定微服务类型的应用列表
     * @param MicroserviceTypeList 查询指定微服务类型的应用列表
     */
    public void setMicroserviceTypeList(String [] MicroserviceTypeList) {
        this.MicroserviceTypeList = MicroserviceTypeList;
    }

    public DescribeSimpleApplicationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSimpleApplicationsRequest(DescribeSimpleApplicationsRequest source) {
        if (source.ApplicationIdList != null) {
            this.ApplicationIdList = new String[source.ApplicationIdList.length];
            for (int i = 0; i < source.ApplicationIdList.length; i++) {
                this.ApplicationIdList[i] = new String(source.ApplicationIdList[i]);
            }
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ApplicationResourceTypeList != null) {
            this.ApplicationResourceTypeList = new String[source.ApplicationResourceTypeList.length];
            for (int i = 0; i < source.ApplicationResourceTypeList.length; i++) {
                this.ApplicationResourceTypeList[i] = new String(source.ApplicationResourceTypeList[i]);
            }
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.DisableProgramAuthCheck != null) {
            this.DisableProgramAuthCheck = new Boolean(source.DisableProgramAuthCheck);
        }
        if (source.MicroserviceTypeList != null) {
            this.MicroserviceTypeList = new String[source.MicroserviceTypeList.length];
            for (int i = 0; i < source.MicroserviceTypeList.length; i++) {
                this.MicroserviceTypeList[i] = new String(source.MicroserviceTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ApplicationIdList.", this.ApplicationIdList);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamArraySimple(map, prefix + "ApplicationResourceTypeList.", this.ApplicationResourceTypeList);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "DisableProgramAuthCheck", this.DisableProgramAuthCheck);
        this.setParamArraySimple(map, prefix + "MicroserviceTypeList.", this.MicroserviceTypeList);

    }
}

