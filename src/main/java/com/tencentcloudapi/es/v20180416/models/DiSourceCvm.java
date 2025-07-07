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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiSourceCvm extends AbstractModel {

    /**
    * 数据源所属vpc id，创建后不允许修改
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * cvm列表
    */
    @SerializedName("CvmIds")
    @Expose
    private String [] CvmIds;

    /**
    * 采集路径列表，支持通配符
    */
    @SerializedName("LogPaths")
    @Expose
    private String [] LogPaths;

    /**
     * Get 数据源所属vpc id，创建后不允许修改 
     * @return VpcId 数据源所属vpc id，创建后不允许修改
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 数据源所属vpc id，创建后不允许修改
     * @param VpcId 数据源所属vpc id，创建后不允许修改
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get cvm列表 
     * @return CvmIds cvm列表
     */
    public String [] getCvmIds() {
        return this.CvmIds;
    }

    /**
     * Set cvm列表
     * @param CvmIds cvm列表
     */
    public void setCvmIds(String [] CvmIds) {
        this.CvmIds = CvmIds;
    }

    /**
     * Get 采集路径列表，支持通配符 
     * @return LogPaths 采集路径列表，支持通配符
     */
    public String [] getLogPaths() {
        return this.LogPaths;
    }

    /**
     * Set 采集路径列表，支持通配符
     * @param LogPaths 采集路径列表，支持通配符
     */
    public void setLogPaths(String [] LogPaths) {
        this.LogPaths = LogPaths;
    }

    public DiSourceCvm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiSourceCvm(DiSourceCvm source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CvmIds != null) {
            this.CvmIds = new String[source.CvmIds.length];
            for (int i = 0; i < source.CvmIds.length; i++) {
                this.CvmIds[i] = new String(source.CvmIds[i]);
            }
        }
        if (source.LogPaths != null) {
            this.LogPaths = new String[source.LogPaths.length];
            for (int i = 0; i < source.LogPaths.length; i++) {
                this.LogPaths[i] = new String(source.LogPaths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "CvmIds.", this.CvmIds);
        this.setParamArraySimple(map, prefix + "LogPaths.", this.LogPaths);

    }
}

