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

public class ModifyServiceProviderModelAttributesRequest extends AbstractModel {

    /**
    * <p>BYOK 实例 ID</p>
    */
    @SerializedName("ServiceProviderId")
    @Expose
    private String ServiceProviderId;

    /**
    * <p>待修改的模型的名称（原始模型名称）</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>该模型支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>video： 支持视频输入</li></ul>
    */
    @SerializedName("InputModalities")
    @Expose
    private String [] InputModalities;

    /**
    * <p>新的上游模型名称</p>
    */
    @SerializedName("NewModelName")
    @Expose
    private String NewModelName;

    /**
    * <p>新的对外模型名称</p>
    */
    @SerializedName("NewModelAlias")
    @Expose
    private String NewModelAlias;

    /**
    * <p>上游模型灰度操作，支持 Set、Promote、Rollback。</p><p>入参限制：未传时沿用普通属性编辑；显式 null、空对象及未知字段拒绝。与显式传入的 NewModelName、NewModelAlias、InputModalities 互斥，包括 null 和空别名。</p><p>Set 必须提供候选 ModelName 和 1～99 的整数 Weight，可调整同一候选的比例；相同配置在资源可编辑时成功且不重复下发。Promote、Rollback 仅传 Operation，分别全量切换到候选或恢复主模型并结束灰度。外层 ModelName 定位当前主模型；响应仍为 RequestId，任务通过 DescribeAsyncJobs 查询。</p>
    */
    @SerializedName("UpstreamRollout")
    @Expose
    private UpstreamRolloutOperation UpstreamRollout;

    /**
     * Get <p>BYOK 实例 ID</p> 
     * @return ServiceProviderId <p>BYOK 实例 ID</p>
     */
    public String getServiceProviderId() {
        return this.ServiceProviderId;
    }

    /**
     * Set <p>BYOK 实例 ID</p>
     * @param ServiceProviderId <p>BYOK 实例 ID</p>
     */
    public void setServiceProviderId(String ServiceProviderId) {
        this.ServiceProviderId = ServiceProviderId;
    }

    /**
     * Get <p>待修改的模型的名称（原始模型名称）</p> 
     * @return ModelName <p>待修改的模型的名称（原始模型名称）</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>待修改的模型的名称（原始模型名称）</p>
     * @param ModelName <p>待修改的模型的名称（原始模型名称）</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>该模型支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>video： 支持视频输入</li></ul> 
     * @return InputModalities <p>该模型支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>video： 支持视频输入</li></ul>
     */
    public String [] getInputModalities() {
        return this.InputModalities;
    }

    /**
     * Set <p>该模型支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>video： 支持视频输入</li></ul>
     * @param InputModalities <p>该模型支持的输入多模态能力列表</p><p>枚举值：</p><ul><li>text： 支持文本输入</li><li>image： 支持图像输入</li><li>file： 支持文件输入（当前仅支持pdf）</li><li>video： 支持视频输入</li></ul>
     */
    public void setInputModalities(String [] InputModalities) {
        this.InputModalities = InputModalities;
    }

    /**
     * Get <p>新的上游模型名称</p> 
     * @return NewModelName <p>新的上游模型名称</p>
     */
    public String getNewModelName() {
        return this.NewModelName;
    }

    /**
     * Set <p>新的上游模型名称</p>
     * @param NewModelName <p>新的上游模型名称</p>
     */
    public void setNewModelName(String NewModelName) {
        this.NewModelName = NewModelName;
    }

    /**
     * Get <p>新的对外模型名称</p> 
     * @return NewModelAlias <p>新的对外模型名称</p>
     */
    public String getNewModelAlias() {
        return this.NewModelAlias;
    }

    /**
     * Set <p>新的对外模型名称</p>
     * @param NewModelAlias <p>新的对外模型名称</p>
     */
    public void setNewModelAlias(String NewModelAlias) {
        this.NewModelAlias = NewModelAlias;
    }

    /**
     * Get <p>上游模型灰度操作，支持 Set、Promote、Rollback。</p><p>入参限制：未传时沿用普通属性编辑；显式 null、空对象及未知字段拒绝。与显式传入的 NewModelName、NewModelAlias、InputModalities 互斥，包括 null 和空别名。</p><p>Set 必须提供候选 ModelName 和 1～99 的整数 Weight，可调整同一候选的比例；相同配置在资源可编辑时成功且不重复下发。Promote、Rollback 仅传 Operation，分别全量切换到候选或恢复主模型并结束灰度。外层 ModelName 定位当前主模型；响应仍为 RequestId，任务通过 DescribeAsyncJobs 查询。</p> 
     * @return UpstreamRollout <p>上游模型灰度操作，支持 Set、Promote、Rollback。</p><p>入参限制：未传时沿用普通属性编辑；显式 null、空对象及未知字段拒绝。与显式传入的 NewModelName、NewModelAlias、InputModalities 互斥，包括 null 和空别名。</p><p>Set 必须提供候选 ModelName 和 1～99 的整数 Weight，可调整同一候选的比例；相同配置在资源可编辑时成功且不重复下发。Promote、Rollback 仅传 Operation，分别全量切换到候选或恢复主模型并结束灰度。外层 ModelName 定位当前主模型；响应仍为 RequestId，任务通过 DescribeAsyncJobs 查询。</p>
     */
    public UpstreamRolloutOperation getUpstreamRollout() {
        return this.UpstreamRollout;
    }

    /**
     * Set <p>上游模型灰度操作，支持 Set、Promote、Rollback。</p><p>入参限制：未传时沿用普通属性编辑；显式 null、空对象及未知字段拒绝。与显式传入的 NewModelName、NewModelAlias、InputModalities 互斥，包括 null 和空别名。</p><p>Set 必须提供候选 ModelName 和 1～99 的整数 Weight，可调整同一候选的比例；相同配置在资源可编辑时成功且不重复下发。Promote、Rollback 仅传 Operation，分别全量切换到候选或恢复主模型并结束灰度。外层 ModelName 定位当前主模型；响应仍为 RequestId，任务通过 DescribeAsyncJobs 查询。</p>
     * @param UpstreamRollout <p>上游模型灰度操作，支持 Set、Promote、Rollback。</p><p>入参限制：未传时沿用普通属性编辑；显式 null、空对象及未知字段拒绝。与显式传入的 NewModelName、NewModelAlias、InputModalities 互斥，包括 null 和空别名。</p><p>Set 必须提供候选 ModelName 和 1～99 的整数 Weight，可调整同一候选的比例；相同配置在资源可编辑时成功且不重复下发。Promote、Rollback 仅传 Operation，分别全量切换到候选或恢复主模型并结束灰度。外层 ModelName 定位当前主模型；响应仍为 RequestId，任务通过 DescribeAsyncJobs 查询。</p>
     */
    public void setUpstreamRollout(UpstreamRolloutOperation UpstreamRollout) {
        this.UpstreamRollout = UpstreamRollout;
    }

    public ModifyServiceProviderModelAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyServiceProviderModelAttributesRequest(ModifyServiceProviderModelAttributesRequest source) {
        if (source.ServiceProviderId != null) {
            this.ServiceProviderId = new String(source.ServiceProviderId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.InputModalities != null) {
            this.InputModalities = new String[source.InputModalities.length];
            for (int i = 0; i < source.InputModalities.length; i++) {
                this.InputModalities[i] = new String(source.InputModalities[i]);
            }
        }
        if (source.NewModelName != null) {
            this.NewModelName = new String(source.NewModelName);
        }
        if (source.NewModelAlias != null) {
            this.NewModelAlias = new String(source.NewModelAlias);
        }
        if (source.UpstreamRollout != null) {
            this.UpstreamRollout = new UpstreamRolloutOperation(source.UpstreamRollout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProviderId", this.ServiceProviderId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamArraySimple(map, prefix + "InputModalities.", this.InputModalities);
        this.setParamSimple(map, prefix + "NewModelName", this.NewModelName);
        this.setParamSimple(map, prefix + "NewModelAlias", this.NewModelAlias);
        this.setParamObj(map, prefix + "UpstreamRollout.", this.UpstreamRollout);

    }
}

