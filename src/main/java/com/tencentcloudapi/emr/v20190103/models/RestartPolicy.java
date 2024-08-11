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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestartPolicy extends AbstractModel {

    /**
    * 重启策略名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略展示名称。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 策略描述。
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 批量重启节点数可选范围。
    */
    @SerializedName("BatchSizeRange")
    @Expose
    private Long [] BatchSizeRange;

    /**
    * 是否是默认策略。
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
     * Get 重启策略名。 
     * @return Name 重启策略名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 重启策略名。
     * @param Name 重启策略名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略展示名称。 
     * @return DisplayName 策略展示名称。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 策略展示名称。
     * @param DisplayName 策略展示名称。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 策略描述。 
     * @return Describe 策略描述。
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 策略描述。
     * @param Describe 策略描述。
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 批量重启节点数可选范围。 
     * @return BatchSizeRange 批量重启节点数可选范围。
     */
    public Long [] getBatchSizeRange() {
        return this.BatchSizeRange;
    }

    /**
     * Set 批量重启节点数可选范围。
     * @param BatchSizeRange 批量重启节点数可选范围。
     */
    public void setBatchSizeRange(Long [] BatchSizeRange) {
        this.BatchSizeRange = BatchSizeRange;
    }

    /**
     * Get 是否是默认策略。 
     * @return IsDefault 是否是默认策略。
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是默认策略。
     * @param IsDefault 是否是默认策略。
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    public RestartPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartPolicy(RestartPolicy source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.BatchSizeRange != null) {
            this.BatchSizeRange = new Long[source.BatchSizeRange.length];
            for (int i = 0; i < source.BatchSizeRange.length; i++) {
                this.BatchSizeRange[i] = new Long(source.BatchSizeRange[i]);
            }
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamArraySimple(map, prefix + "BatchSizeRange.", this.BatchSizeRange);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);

    }
}

