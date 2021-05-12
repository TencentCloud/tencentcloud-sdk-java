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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetCrowdPackListRequest extends AbstractModel{

    /**
    * 商户证书
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 人群包名称，用于过滤人群包
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 人群包状态，默认-1，用于过滤人群包
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 商户证书 
     * @return License 商户证书
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * Set 商户证书
     * @param License 商户证书
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制返回数量 
     * @return Limit 限制返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制返回数量
     * @param Limit 限制返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 人群包名称，用于过滤人群包 
     * @return Name 人群包名称，用于过滤人群包
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 人群包名称，用于过滤人群包
     * @param Name 人群包名称，用于过滤人群包
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 人群包状态，默认-1，用于过滤人群包 
     * @return Status 人群包状态，默认-1，用于过滤人群包
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 人群包状态，默认-1，用于过滤人群包
     * @param Status 人群包状态，默认-1，用于过滤人群包
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public GetCrowdPackListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetCrowdPackListRequest(GetCrowdPackListRequest source) {
        if (source.License != null) {
            this.License = new String(source.License);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

