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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTarget extends AbstractModel {

    /**
    * 目标标签ID
    */
    @SerializedName("TargetId")
    @Expose
    private Long TargetId;

    /**
    * 目标描述
    */
    @SerializedName("TargetDesc")
    @Expose
    private String TargetDesc;

    /**
    * 1:演练场景
2:演练目标
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 1:平台 2:用户个人
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 目标标签是否已被删除
    */
    @SerializedName("TargetStatus")
    @Expose
    private Long TargetStatus;

    /**
     * Get 目标标签ID 
     * @return TargetId 目标标签ID
     */
    public Long getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 目标标签ID
     * @param TargetId 目标标签ID
     */
    public void setTargetId(Long TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 目标描述 
     * @return TargetDesc 目标描述
     */
    public String getTargetDesc() {
        return this.TargetDesc;
    }

    /**
     * Set 目标描述
     * @param TargetDesc 目标描述
     */
    public void setTargetDesc(String TargetDesc) {
        this.TargetDesc = TargetDesc;
    }

    /**
     * Get 1:演练场景
2:演练目标 
     * @return Type 1:演练场景
2:演练目标
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1:演练场景
2:演练目标
     * @param Type 1:演练场景
2:演练目标
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 1:平台 2:用户个人 
     * @return Source 1:平台 2:用户个人
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 1:平台 2:用户个人
     * @param Source 1:平台 2:用户个人
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 目标标签是否已被删除 
     * @return TargetStatus 目标标签是否已被删除
     */
    public Long getTargetStatus() {
        return this.TargetStatus;
    }

    /**
     * Set 目标标签是否已被删除
     * @param TargetStatus 目标标签是否已被删除
     */
    public void setTargetStatus(Long TargetStatus) {
        this.TargetStatus = TargetStatus;
    }

    public TaskTarget() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTarget(TaskTarget source) {
        if (source.TargetId != null) {
            this.TargetId = new Long(source.TargetId);
        }
        if (source.TargetDesc != null) {
            this.TargetDesc = new String(source.TargetDesc);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.TargetStatus != null) {
            this.TargetStatus = new Long(source.TargetStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetDesc", this.TargetDesc);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TargetStatus", this.TargetStatus);

    }
}

