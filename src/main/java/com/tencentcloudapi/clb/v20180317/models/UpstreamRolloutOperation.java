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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpstreamRolloutOperation extends AbstractModel {

    /**
    * <p>上游模型灰度操作类型。Set：开始灰度或调整同一候选的比例；Promote：全量切换到候选模型并结束灰度；Rollback：保留当前主模型并结束灰度。</p><p>入参限制：仅支持 Set、Promote、Rollback，区分大小写。Promote 和 Rollback 仅允许在灰度中使用，且禁止携带 ModelName、Weight。</p>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>候选上游模型的原始名称，保留名称中的斜杠。</p><p>入参限制：Operation 为 Set 时必填，非空且最长 128 个字符；不能与当前主模型相同，不能占用同一 BYOK 的其他主模型或有效灰度候选名称。Promote、Rollback 禁止传入。</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>候选上游模型的灰度流量比例。</p><p>取值范围：[1, 99]</p><p>单位：%</p><p>Set 时必填，无默认值，必须为整数；拒绝 0、100、小数、布尔值及字符串。Promote、Rollback 禁止传入。比例只影响需要重新选择上游的请求，已有有效 Sticky 绑定不迁移，实际流量占比不保证等于配置比例。</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get <p>上游模型灰度操作类型。Set：开始灰度或调整同一候选的比例；Promote：全量切换到候选模型并结束灰度；Rollback：保留当前主模型并结束灰度。</p><p>入参限制：仅支持 Set、Promote、Rollback，区分大小写。Promote 和 Rollback 仅允许在灰度中使用，且禁止携带 ModelName、Weight。</p> 
     * @return Operation <p>上游模型灰度操作类型。Set：开始灰度或调整同一候选的比例；Promote：全量切换到候选模型并结束灰度；Rollback：保留当前主模型并结束灰度。</p><p>入参限制：仅支持 Set、Promote、Rollback，区分大小写。Promote 和 Rollback 仅允许在灰度中使用，且禁止携带 ModelName、Weight。</p>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>上游模型灰度操作类型。Set：开始灰度或调整同一候选的比例；Promote：全量切换到候选模型并结束灰度；Rollback：保留当前主模型并结束灰度。</p><p>入参限制：仅支持 Set、Promote、Rollback，区分大小写。Promote 和 Rollback 仅允许在灰度中使用，且禁止携带 ModelName、Weight。</p>
     * @param Operation <p>上游模型灰度操作类型。Set：开始灰度或调整同一候选的比例；Promote：全量切换到候选模型并结束灰度；Rollback：保留当前主模型并结束灰度。</p><p>入参限制：仅支持 Set、Promote、Rollback，区分大小写。Promote 和 Rollback 仅允许在灰度中使用，且禁止携带 ModelName、Weight。</p>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>候选上游模型的原始名称，保留名称中的斜杠。</p><p>入参限制：Operation 为 Set 时必填，非空且最长 128 个字符；不能与当前主模型相同，不能占用同一 BYOK 的其他主模型或有效灰度候选名称。Promote、Rollback 禁止传入。</p> 
     * @return ModelName <p>候选上游模型的原始名称，保留名称中的斜杠。</p><p>入参限制：Operation 为 Set 时必填，非空且最长 128 个字符；不能与当前主模型相同，不能占用同一 BYOK 的其他主模型或有效灰度候选名称。Promote、Rollback 禁止传入。</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>候选上游模型的原始名称，保留名称中的斜杠。</p><p>入参限制：Operation 为 Set 时必填，非空且最长 128 个字符；不能与当前主模型相同，不能占用同一 BYOK 的其他主模型或有效灰度候选名称。Promote、Rollback 禁止传入。</p>
     * @param ModelName <p>候选上游模型的原始名称，保留名称中的斜杠。</p><p>入参限制：Operation 为 Set 时必填，非空且最长 128 个字符；不能与当前主模型相同，不能占用同一 BYOK 的其他主模型或有效灰度候选名称。Promote、Rollback 禁止传入。</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>候选上游模型的灰度流量比例。</p><p>取值范围：[1, 99]</p><p>单位：%</p><p>Set 时必填，无默认值，必须为整数；拒绝 0、100、小数、布尔值及字符串。Promote、Rollback 禁止传入。比例只影响需要重新选择上游的请求，已有有效 Sticky 绑定不迁移，实际流量占比不保证等于配置比例。</p> 
     * @return Weight <p>候选上游模型的灰度流量比例。</p><p>取值范围：[1, 99]</p><p>单位：%</p><p>Set 时必填，无默认值，必须为整数；拒绝 0、100、小数、布尔值及字符串。Promote、Rollback 禁止传入。比例只影响需要重新选择上游的请求，已有有效 Sticky 绑定不迁移，实际流量占比不保证等于配置比例。</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>候选上游模型的灰度流量比例。</p><p>取值范围：[1, 99]</p><p>单位：%</p><p>Set 时必填，无默认值，必须为整数；拒绝 0、100、小数、布尔值及字符串。Promote、Rollback 禁止传入。比例只影响需要重新选择上游的请求，已有有效 Sticky 绑定不迁移，实际流量占比不保证等于配置比例。</p>
     * @param Weight <p>候选上游模型的灰度流量比例。</p><p>取值范围：[1, 99]</p><p>单位：%</p><p>Set 时必填，无默认值，必须为整数；拒绝 0、100、小数、布尔值及字符串。Promote、Rollback 禁止传入。比例只影响需要重新选择上游的请求，已有有效 Sticky 绑定不迁移，实际流量占比不保证等于配置比例。</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public UpstreamRolloutOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpstreamRolloutOperation(UpstreamRolloutOperation source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

