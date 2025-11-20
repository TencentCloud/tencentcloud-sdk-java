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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceType extends AbstractModel {

    /**
    * 账号组来源
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 账号组来源类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 账号组来源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 区分ioa原来和iam-mini
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
     * Get 账号组来源 
     * @return Source 账号组来源
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 账号组来源
     * @param Source 账号组来源
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 账号组来源类型 
     * @return Type 账号组来源类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 账号组来源类型
     * @param Type 账号组来源类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 账号组来源名称 
     * @return Name 账号组来源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 账号组来源名称
     * @param Name 账号组来源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 区分ioa原来和iam-mini 
     * @return Target 区分ioa原来和iam-mini
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 区分ioa原来和iam-mini
     * @param Target 区分ioa原来和iam-mini
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    public SourceType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceType(SourceType source) {
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Target != null) {
            this.Target = new String(source.Target);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Target", this.Target);

    }
}

