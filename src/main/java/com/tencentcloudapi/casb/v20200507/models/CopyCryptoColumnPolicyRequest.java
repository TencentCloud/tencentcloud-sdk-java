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
package com.tencentcloudapi.casb.v20200507.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CopyCryptoColumnPolicyRequest extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("CasbId")
    @Expose
    private String CasbId;

    /**
    * 元数据id
    */
    @SerializedName("MetaDataId")
    @Expose
    private String MetaDataId;

    /**
    * 目标实例Id 如果和实例Id相同则为同CasbId下的策略复制
    */
    @SerializedName("DstCasbId")
    @Expose
    private String DstCasbId;

    /**
    * 目标实例Id 如果和[元数据id]相同则为同元数据下的策略复制
    */
    @SerializedName("DstMetaDataId")
    @Expose
    private String DstMetaDataId;

    /**
    * 筛选来源数据库的表
    */
    @SerializedName("SrcTableFilter")
    @Expose
    private CryptoCopyColumnPolicyTableFilter [] SrcTableFilter;

    /**
    * 复制同元数据下的策略，需要填写目标数据库名
    */
    @SerializedName("DstDatabaseName")
    @Expose
    private String DstDatabaseName;

    /**
     * Get 实例Id 
     * @return CasbId 实例Id
     */
    public String getCasbId() {
        return this.CasbId;
    }

    /**
     * Set 实例Id
     * @param CasbId 实例Id
     */
    public void setCasbId(String CasbId) {
        this.CasbId = CasbId;
    }

    /**
     * Get 元数据id 
     * @return MetaDataId 元数据id
     */
    public String getMetaDataId() {
        return this.MetaDataId;
    }

    /**
     * Set 元数据id
     * @param MetaDataId 元数据id
     */
    public void setMetaDataId(String MetaDataId) {
        this.MetaDataId = MetaDataId;
    }

    /**
     * Get 目标实例Id 如果和实例Id相同则为同CasbId下的策略复制 
     * @return DstCasbId 目标实例Id 如果和实例Id相同则为同CasbId下的策略复制
     */
    public String getDstCasbId() {
        return this.DstCasbId;
    }

    /**
     * Set 目标实例Id 如果和实例Id相同则为同CasbId下的策略复制
     * @param DstCasbId 目标实例Id 如果和实例Id相同则为同CasbId下的策略复制
     */
    public void setDstCasbId(String DstCasbId) {
        this.DstCasbId = DstCasbId;
    }

    /**
     * Get 目标实例Id 如果和[元数据id]相同则为同元数据下的策略复制 
     * @return DstMetaDataId 目标实例Id 如果和[元数据id]相同则为同元数据下的策略复制
     */
    public String getDstMetaDataId() {
        return this.DstMetaDataId;
    }

    /**
     * Set 目标实例Id 如果和[元数据id]相同则为同元数据下的策略复制
     * @param DstMetaDataId 目标实例Id 如果和[元数据id]相同则为同元数据下的策略复制
     */
    public void setDstMetaDataId(String DstMetaDataId) {
        this.DstMetaDataId = DstMetaDataId;
    }

    /**
     * Get 筛选来源数据库的表 
     * @return SrcTableFilter 筛选来源数据库的表
     */
    public CryptoCopyColumnPolicyTableFilter [] getSrcTableFilter() {
        return this.SrcTableFilter;
    }

    /**
     * Set 筛选来源数据库的表
     * @param SrcTableFilter 筛选来源数据库的表
     */
    public void setSrcTableFilter(CryptoCopyColumnPolicyTableFilter [] SrcTableFilter) {
        this.SrcTableFilter = SrcTableFilter;
    }

    /**
     * Get 复制同元数据下的策略，需要填写目标数据库名 
     * @return DstDatabaseName 复制同元数据下的策略，需要填写目标数据库名
     */
    public String getDstDatabaseName() {
        return this.DstDatabaseName;
    }

    /**
     * Set 复制同元数据下的策略，需要填写目标数据库名
     * @param DstDatabaseName 复制同元数据下的策略，需要填写目标数据库名
     */
    public void setDstDatabaseName(String DstDatabaseName) {
        this.DstDatabaseName = DstDatabaseName;
    }

    public CopyCryptoColumnPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CopyCryptoColumnPolicyRequest(CopyCryptoColumnPolicyRequest source) {
        if (source.CasbId != null) {
            this.CasbId = new String(source.CasbId);
        }
        if (source.MetaDataId != null) {
            this.MetaDataId = new String(source.MetaDataId);
        }
        if (source.DstCasbId != null) {
            this.DstCasbId = new String(source.DstCasbId);
        }
        if (source.DstMetaDataId != null) {
            this.DstMetaDataId = new String(source.DstMetaDataId);
        }
        if (source.SrcTableFilter != null) {
            this.SrcTableFilter = new CryptoCopyColumnPolicyTableFilter[source.SrcTableFilter.length];
            for (int i = 0; i < source.SrcTableFilter.length; i++) {
                this.SrcTableFilter[i] = new CryptoCopyColumnPolicyTableFilter(source.SrcTableFilter[i]);
            }
        }
        if (source.DstDatabaseName != null) {
            this.DstDatabaseName = new String(source.DstDatabaseName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CasbId", this.CasbId);
        this.setParamSimple(map, prefix + "MetaDataId", this.MetaDataId);
        this.setParamSimple(map, prefix + "DstCasbId", this.DstCasbId);
        this.setParamSimple(map, prefix + "DstMetaDataId", this.DstMetaDataId);
        this.setParamArrayObj(map, prefix + "SrcTableFilter.", this.SrcTableFilter);
        this.setParamSimple(map, prefix + "DstDatabaseName", this.DstDatabaseName);

    }
}

