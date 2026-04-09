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
    * <p>目标标签ID</p>
    */
    @SerializedName("TargetId")
    @Expose
    private Long TargetId;

    /**
    * <p>目标描述</p>
    */
    @SerializedName("TargetDesc")
    @Expose
    private String TargetDesc;

    /**
    * <p>1:演练场景<br>2:演练目标</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>1:平台 2:用户个人</p>
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * <p>目标标签是否已被删除</p><p>枚举值：</p><ul><li>0： 未删除</li><li>1： 已删除</li></ul>
    */
    @SerializedName("TargetStatus")
    @Expose
    private Long TargetStatus;

    /**
     * Get <p>目标标签ID</p> 
     * @return TargetId <p>目标标签ID</p>
     */
    public Long getTargetId() {
        return this.TargetId;
    }

    /**
     * Set <p>目标标签ID</p>
     * @param TargetId <p>目标标签ID</p>
     */
    public void setTargetId(Long TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get <p>目标描述</p> 
     * @return TargetDesc <p>目标描述</p>
     */
    public String getTargetDesc() {
        return this.TargetDesc;
    }

    /**
     * Set <p>目标描述</p>
     * @param TargetDesc <p>目标描述</p>
     */
    public void setTargetDesc(String TargetDesc) {
        this.TargetDesc = TargetDesc;
    }

    /**
     * Get <p>1:演练场景<br>2:演练目标</p> 
     * @return Type <p>1:演练场景<br>2:演练目标</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>1:演练场景<br>2:演练目标</p>
     * @param Type <p>1:演练场景<br>2:演练目标</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>1:平台 2:用户个人</p> 
     * @return Source <p>1:平台 2:用户个人</p>
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set <p>1:平台 2:用户个人</p>
     * @param Source <p>1:平台 2:用户个人</p>
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get <p>目标标签是否已被删除</p><p>枚举值：</p><ul><li>0： 未删除</li><li>1： 已删除</li></ul> 
     * @return TargetStatus <p>目标标签是否已被删除</p><p>枚举值：</p><ul><li>0： 未删除</li><li>1： 已删除</li></ul>
     */
    public Long getTargetStatus() {
        return this.TargetStatus;
    }

    /**
     * Set <p>目标标签是否已被删除</p><p>枚举值：</p><ul><li>0： 未删除</li><li>1： 已删除</li></ul>
     * @param TargetStatus <p>目标标签是否已被删除</p><p>枚举值：</p><ul><li>0： 未删除</li><li>1： 已删除</li></ul>
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

