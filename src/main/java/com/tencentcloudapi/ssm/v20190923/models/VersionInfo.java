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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionInfo extends AbstractModel {

    /**
    * <p>版本号</p>
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>创建时间，unix时间戳。</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>该版本持有的公开版本标签列表，用于查看标签指向。</p><p>自定义、云产品及 Redis/MongoDB 凭据在版本列表中返回此字段，仅包含 Stage_Current；无标签时返回空数组 []。</p>
    */
    @SerializedName("VersionStages")
    @Expose
    private String [] VersionStages;

    /**
     * Get <p>版本号</p> 
     * @return VersionId <p>版本号</p>
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>版本号</p>
     * @param VersionId <p>版本号</p>
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>创建时间，unix时间戳。</p> 
     * @return CreateTime <p>创建时间，unix时间戳。</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，unix时间戳。</p>
     * @param CreateTime <p>创建时间，unix时间戳。</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>该版本持有的公开版本标签列表，用于查看标签指向。</p><p>自定义、云产品及 Redis/MongoDB 凭据在版本列表中返回此字段，仅包含 Stage_Current；无标签时返回空数组 []。</p> 
     * @return VersionStages <p>该版本持有的公开版本标签列表，用于查看标签指向。</p><p>自定义、云产品及 Redis/MongoDB 凭据在版本列表中返回此字段，仅包含 Stage_Current；无标签时返回空数组 []。</p>
     */
    public String [] getVersionStages() {
        return this.VersionStages;
    }

    /**
     * Set <p>该版本持有的公开版本标签列表，用于查看标签指向。</p><p>自定义、云产品及 Redis/MongoDB 凭据在版本列表中返回此字段，仅包含 Stage_Current；无标签时返回空数组 []。</p>
     * @param VersionStages <p>该版本持有的公开版本标签列表，用于查看标签指向。</p><p>自定义、云产品及 Redis/MongoDB 凭据在版本列表中返回此字段，仅包含 Stage_Current；无标签时返回空数组 []。</p>
     */
    public void setVersionStages(String [] VersionStages) {
        this.VersionStages = VersionStages;
    }

    public VersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionInfo(VersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.VersionStages != null) {
            this.VersionStages = new String[source.VersionStages.length];
            for (int i = 0; i < source.VersionStages.length; i++) {
                this.VersionStages[i] = new String(source.VersionStages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "VersionStages.", this.VersionStages);

    }
}

