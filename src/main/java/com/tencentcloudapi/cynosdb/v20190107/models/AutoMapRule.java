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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoMapRule extends AbstractModel {

    /**
    * 源端实例Id
    */
    @SerializedName("SrcInstanceId")
    @Expose
    private String SrcInstanceId;

    /**
    * 源端数据库正则
    */
    @SerializedName("SrcDatabaseRegex")
    @Expose
    private String SrcDatabaseRegex;

    /**
    * 源端表正则
    */
    @SerializedName("SrcTableRegex")
    @Expose
    private String SrcTableRegex;

    /**
    * 目标端数据库正则
    */
    @SerializedName("DstDatabaseRegex")
    @Expose
    private String DstDatabaseRegex;

    /**
    * 目标端表正则
    */
    @SerializedName("DstTableRegex")
    @Expose
    private String DstTableRegex;

    /**
     * Get 源端实例Id 
     * @return SrcInstanceId 源端实例Id
     */
    public String getSrcInstanceId() {
        return this.SrcInstanceId;
    }

    /**
     * Set 源端实例Id
     * @param SrcInstanceId 源端实例Id
     */
    public void setSrcInstanceId(String SrcInstanceId) {
        this.SrcInstanceId = SrcInstanceId;
    }

    /**
     * Get 源端数据库正则 
     * @return SrcDatabaseRegex 源端数据库正则
     */
    public String getSrcDatabaseRegex() {
        return this.SrcDatabaseRegex;
    }

    /**
     * Set 源端数据库正则
     * @param SrcDatabaseRegex 源端数据库正则
     */
    public void setSrcDatabaseRegex(String SrcDatabaseRegex) {
        this.SrcDatabaseRegex = SrcDatabaseRegex;
    }

    /**
     * Get 源端表正则 
     * @return SrcTableRegex 源端表正则
     */
    public String getSrcTableRegex() {
        return this.SrcTableRegex;
    }

    /**
     * Set 源端表正则
     * @param SrcTableRegex 源端表正则
     */
    public void setSrcTableRegex(String SrcTableRegex) {
        this.SrcTableRegex = SrcTableRegex;
    }

    /**
     * Get 目标端数据库正则 
     * @return DstDatabaseRegex 目标端数据库正则
     */
    public String getDstDatabaseRegex() {
        return this.DstDatabaseRegex;
    }

    /**
     * Set 目标端数据库正则
     * @param DstDatabaseRegex 目标端数据库正则
     */
    public void setDstDatabaseRegex(String DstDatabaseRegex) {
        this.DstDatabaseRegex = DstDatabaseRegex;
    }

    /**
     * Get 目标端表正则 
     * @return DstTableRegex 目标端表正则
     */
    public String getDstTableRegex() {
        return this.DstTableRegex;
    }

    /**
     * Set 目标端表正则
     * @param DstTableRegex 目标端表正则
     */
    public void setDstTableRegex(String DstTableRegex) {
        this.DstTableRegex = DstTableRegex;
    }

    public AutoMapRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoMapRule(AutoMapRule source) {
        if (source.SrcInstanceId != null) {
            this.SrcInstanceId = new String(source.SrcInstanceId);
        }
        if (source.SrcDatabaseRegex != null) {
            this.SrcDatabaseRegex = new String(source.SrcDatabaseRegex);
        }
        if (source.SrcTableRegex != null) {
            this.SrcTableRegex = new String(source.SrcTableRegex);
        }
        if (source.DstDatabaseRegex != null) {
            this.DstDatabaseRegex = new String(source.DstDatabaseRegex);
        }
        if (source.DstTableRegex != null) {
            this.DstTableRegex = new String(source.DstTableRegex);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SrcInstanceId", this.SrcInstanceId);
        this.setParamSimple(map, prefix + "SrcDatabaseRegex", this.SrcDatabaseRegex);
        this.setParamSimple(map, prefix + "SrcTableRegex", this.SrcTableRegex);
        this.setParamSimple(map, prefix + "DstDatabaseRegex", this.DstDatabaseRegex);
        this.setParamSimple(map, prefix + "DstTableRegex", this.DstTableRegex);

    }
}

