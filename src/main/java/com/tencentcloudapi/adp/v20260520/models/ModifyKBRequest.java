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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyKBRequest extends AbstractModel {

    /**
    * <p>知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

    /**
    * <p>可写属性（与 update_mask 配合使用）</p>
    */
    @SerializedName("Spec")
    @Expose
    private KBSpec Spec;

    /**
    * <p>字段掩码：指定要修改的字段（蛇形字段名），未列出的字段忽略</p>
    */
    @SerializedName("UpdateMask")
    @Expose
    private FieldMask UpdateMask;

    /**
    * <p>扩展操作（用于承载无法归类到常规字段修改的特殊操作，例如触发超量恢复等；需在 update_mask 中同时传入 &#39;extend_fields&#39; 才会生效，取值参见 KBExtendedAction：1=触发恢复超量）</p>
    */
    @SerializedName("ExtendFields")
    @Expose
    private KBModifyExtendFields ExtendFields;

    /**
     * Get <p>知识库 ID</p> 
     * @return KbId <p>知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>知识库 ID</p>
     * @param KbId <p>知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

    /**
     * Get <p>可写属性（与 update_mask 配合使用）</p> 
     * @return Spec <p>可写属性（与 update_mask 配合使用）</p>
     */
    public KBSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>可写属性（与 update_mask 配合使用）</p>
     * @param Spec <p>可写属性（与 update_mask 配合使用）</p>
     */
    public void setSpec(KBSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>字段掩码：指定要修改的字段（蛇形字段名），未列出的字段忽略</p> 
     * @return UpdateMask <p>字段掩码：指定要修改的字段（蛇形字段名），未列出的字段忽略</p>
     */
    public FieldMask getUpdateMask() {
        return this.UpdateMask;
    }

    /**
     * Set <p>字段掩码：指定要修改的字段（蛇形字段名），未列出的字段忽略</p>
     * @param UpdateMask <p>字段掩码：指定要修改的字段（蛇形字段名），未列出的字段忽略</p>
     */
    public void setUpdateMask(FieldMask UpdateMask) {
        this.UpdateMask = UpdateMask;
    }

    /**
     * Get <p>扩展操作（用于承载无法归类到常规字段修改的特殊操作，例如触发超量恢复等；需在 update_mask 中同时传入 &#39;extend_fields&#39; 才会生效，取值参见 KBExtendedAction：1=触发恢复超量）</p> 
     * @return ExtendFields <p>扩展操作（用于承载无法归类到常规字段修改的特殊操作，例如触发超量恢复等；需在 update_mask 中同时传入 &#39;extend_fields&#39; 才会生效，取值参见 KBExtendedAction：1=触发恢复超量）</p>
     */
    public KBModifyExtendFields getExtendFields() {
        return this.ExtendFields;
    }

    /**
     * Set <p>扩展操作（用于承载无法归类到常规字段修改的特殊操作，例如触发超量恢复等；需在 update_mask 中同时传入 &#39;extend_fields&#39; 才会生效，取值参见 KBExtendedAction：1=触发恢复超量）</p>
     * @param ExtendFields <p>扩展操作（用于承载无法归类到常规字段修改的特殊操作，例如触发超量恢复等；需在 update_mask 中同时传入 &#39;extend_fields&#39; 才会生效，取值参见 KBExtendedAction：1=触发恢复超量）</p>
     */
    public void setExtendFields(KBModifyExtendFields ExtendFields) {
        this.ExtendFields = ExtendFields;
    }

    public ModifyKBRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKBRequest(ModifyKBRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.Spec != null) {
            this.Spec = new KBSpec(source.Spec);
        }
        if (source.UpdateMask != null) {
            this.UpdateMask = new FieldMask(source.UpdateMask);
        }
        if (source.ExtendFields != null) {
            this.ExtendFields = new KBModifyExtendFields(source.ExtendFields);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamObj(map, prefix + "UpdateMask.", this.UpdateMask);
        this.setParamObj(map, prefix + "ExtendFields.", this.ExtendFields);

    }
}

