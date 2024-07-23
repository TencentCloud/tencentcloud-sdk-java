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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamTpl extends AbstractModel {

    /**
    * 参数模板名称
    */
    @SerializedName("TplName")
    @Expose
    private String TplName;

    /**
    * 参数模板ID
    */
    @SerializedName("TplId")
    @Expose
    private String TplId;

    /**
    * 适用数据库版本
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 适用数据库类型
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 参数模板描述
    */
    @SerializedName("TplDesc")
    @Expose
    private String TplDesc;

    /**
    * 模板类型，包括DEFAULT（默认模板）及CUSTOMIZE（定制模板）两种类型
    */
    @SerializedName("TplType")
    @Expose
    private String TplType;

    /**
     * Get 参数模板名称 
     * @return TplName 参数模板名称
     */
    public String getTplName() {
        return this.TplName;
    }

    /**
     * Set 参数模板名称
     * @param TplName 参数模板名称
     */
    public void setTplName(String TplName) {
        this.TplName = TplName;
    }

    /**
     * Get 参数模板ID 
     * @return TplId 参数模板ID
     */
    public String getTplId() {
        return this.TplId;
    }

    /**
     * Set 参数模板ID
     * @param TplId 参数模板ID
     */
    public void setTplId(String TplId) {
        this.TplId = TplId;
    }

    /**
     * Get 适用数据库版本 
     * @return MongoVersion 适用数据库版本
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * Set 适用数据库版本
     * @param MongoVersion 适用数据库版本
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * Get 适用数据库类型 
     * @return ClusterType 适用数据库类型
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 适用数据库类型
     * @param ClusterType 适用数据库类型
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 参数模板描述 
     * @return TplDesc 参数模板描述
     */
    public String getTplDesc() {
        return this.TplDesc;
    }

    /**
     * Set 参数模板描述
     * @param TplDesc 参数模板描述
     */
    public void setTplDesc(String TplDesc) {
        this.TplDesc = TplDesc;
    }

    /**
     * Get 模板类型，包括DEFAULT（默认模板）及CUSTOMIZE（定制模板）两种类型 
     * @return TplType 模板类型，包括DEFAULT（默认模板）及CUSTOMIZE（定制模板）两种类型
     */
    public String getTplType() {
        return this.TplType;
    }

    /**
     * Set 模板类型，包括DEFAULT（默认模板）及CUSTOMIZE（定制模板）两种类型
     * @param TplType 模板类型，包括DEFAULT（默认模板）及CUSTOMIZE（定制模板）两种类型
     */
    public void setTplType(String TplType) {
        this.TplType = TplType;
    }

    public ParamTpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParamTpl(ParamTpl source) {
        if (source.TplName != null) {
            this.TplName = new String(source.TplName);
        }
        if (source.TplId != null) {
            this.TplId = new String(source.TplId);
        }
        if (source.MongoVersion != null) {
            this.MongoVersion = new String(source.MongoVersion);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.TplDesc != null) {
            this.TplDesc = new String(source.TplDesc);
        }
        if (source.TplType != null) {
            this.TplType = new String(source.TplType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TplName", this.TplName);
        this.setParamSimple(map, prefix + "TplId", this.TplId);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "TplDesc", this.TplDesc);
        this.setParamSimple(map, prefix + "TplType", this.TplType);

    }
}

