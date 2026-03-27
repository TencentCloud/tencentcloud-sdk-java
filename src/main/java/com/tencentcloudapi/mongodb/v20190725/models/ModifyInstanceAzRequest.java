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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstanceAzRequest extends AbstractModel {

    /**
    * <p>实例 ID，例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>主节点所在的可用区 ID。获取方式，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
    */
    @SerializedName("PrimaryNodeZone")
    @Expose
    private String PrimaryNodeZone;

    /**
    * <p>从节点所在的可用区 ID 列表。<br><strong>注意</strong>：不可包含主节点与 Hidden 节点所在的可用区。</p>
    */
    @SerializedName("SecondaryNodeZone")
    @Expose
    private String [] SecondaryNodeZone;

    /**
    * <p>若当前实例未配置 Hidden 节点，则无需传入此参数。</p>
    */
    @SerializedName("HiddenNodeZone")
    @Expose
    private String HiddenNodeZone;

    /**
    * <p>只读节点所在的可用区 ID 列表。<br><strong>注意</strong>：若当前实例已包含只读节点，则此参数为必填项。</p>
    */
    @SerializedName("ReadonlyNodeZone")
    @Expose
    private String [] ReadonlyNodeZone;

    /**
    * <p>指定切换可用区的执行时间策略。</p><ul><li>0：立即执行切换。</li><li>1：在设定的维护时间窗执行切换。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/19910">设置实例维护时间</a>。</li></ul>
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
     * Get <p>实例 ID，例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID，例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID，例如：cmgo-p8vn****。请登录 <a href="https://console.cloud.tencent.com/mongodb">MongoDB 控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>主节点所在的可用区 ID。获取方式，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p> 
     * @return PrimaryNodeZone <p>主节点所在的可用区 ID。获取方式，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
     */
    public String getPrimaryNodeZone() {
        return this.PrimaryNodeZone;
    }

    /**
     * Set <p>主节点所在的可用区 ID。获取方式，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
     * @param PrimaryNodeZone <p>主节点所在的可用区 ID。获取方式，请参见<a href="https://cloud.tencent.com/document/product/240/3637">地域和可用区</a>。</p>
     */
    public void setPrimaryNodeZone(String PrimaryNodeZone) {
        this.PrimaryNodeZone = PrimaryNodeZone;
    }

    /**
     * Get <p>从节点所在的可用区 ID 列表。<br><strong>注意</strong>：不可包含主节点与 Hidden 节点所在的可用区。</p> 
     * @return SecondaryNodeZone <p>从节点所在的可用区 ID 列表。<br><strong>注意</strong>：不可包含主节点与 Hidden 节点所在的可用区。</p>
     */
    public String [] getSecondaryNodeZone() {
        return this.SecondaryNodeZone;
    }

    /**
     * Set <p>从节点所在的可用区 ID 列表。<br><strong>注意</strong>：不可包含主节点与 Hidden 节点所在的可用区。</p>
     * @param SecondaryNodeZone <p>从节点所在的可用区 ID 列表。<br><strong>注意</strong>：不可包含主节点与 Hidden 节点所在的可用区。</p>
     */
    public void setSecondaryNodeZone(String [] SecondaryNodeZone) {
        this.SecondaryNodeZone = SecondaryNodeZone;
    }

    /**
     * Get <p>若当前实例未配置 Hidden 节点，则无需传入此参数。</p> 
     * @return HiddenNodeZone <p>若当前实例未配置 Hidden 节点，则无需传入此参数。</p>
     */
    public String getHiddenNodeZone() {
        return this.HiddenNodeZone;
    }

    /**
     * Set <p>若当前实例未配置 Hidden 节点，则无需传入此参数。</p>
     * @param HiddenNodeZone <p>若当前实例未配置 Hidden 节点，则无需传入此参数。</p>
     */
    public void setHiddenNodeZone(String HiddenNodeZone) {
        this.HiddenNodeZone = HiddenNodeZone;
    }

    /**
     * Get <p>只读节点所在的可用区 ID 列表。<br><strong>注意</strong>：若当前实例已包含只读节点，则此参数为必填项。</p> 
     * @return ReadonlyNodeZone <p>只读节点所在的可用区 ID 列表。<br><strong>注意</strong>：若当前实例已包含只读节点，则此参数为必填项。</p>
     */
    public String [] getReadonlyNodeZone() {
        return this.ReadonlyNodeZone;
    }

    /**
     * Set <p>只读节点所在的可用区 ID 列表。<br><strong>注意</strong>：若当前实例已包含只读节点，则此参数为必填项。</p>
     * @param ReadonlyNodeZone <p>只读节点所在的可用区 ID 列表。<br><strong>注意</strong>：若当前实例已包含只读节点，则此参数为必填项。</p>
     */
    public void setReadonlyNodeZone(String [] ReadonlyNodeZone) {
        this.ReadonlyNodeZone = ReadonlyNodeZone;
    }

    /**
     * Get <p>指定切换可用区的执行时间策略。</p><ul><li>0：立即执行切换。</li><li>1：在设定的维护时间窗执行切换。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/19910">设置实例维护时间</a>。</li></ul> 
     * @return InMaintenance <p>指定切换可用区的执行时间策略。</p><ul><li>0：立即执行切换。</li><li>1：在设定的维护时间窗执行切换。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/19910">设置实例维护时间</a>。</li></ul>
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set <p>指定切换可用区的执行时间策略。</p><ul><li>0：立即执行切换。</li><li>1：在设定的维护时间窗执行切换。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/19910">设置实例维护时间</a>。</li></ul>
     * @param InMaintenance <p>指定切换可用区的执行时间策略。</p><ul><li>0：立即执行切换。</li><li>1：在设定的维护时间窗执行切换。具体信息，请参见<a href="https://cloud.tencent.com/document/product/240/19910">设置实例维护时间</a>。</li></ul>
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    public ModifyInstanceAzRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstanceAzRequest(ModifyInstanceAzRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PrimaryNodeZone != null) {
            this.PrimaryNodeZone = new String(source.PrimaryNodeZone);
        }
        if (source.SecondaryNodeZone != null) {
            this.SecondaryNodeZone = new String[source.SecondaryNodeZone.length];
            for (int i = 0; i < source.SecondaryNodeZone.length; i++) {
                this.SecondaryNodeZone[i] = new String(source.SecondaryNodeZone[i]);
            }
        }
        if (source.HiddenNodeZone != null) {
            this.HiddenNodeZone = new String(source.HiddenNodeZone);
        }
        if (source.ReadonlyNodeZone != null) {
            this.ReadonlyNodeZone = new String[source.ReadonlyNodeZone.length];
            for (int i = 0; i < source.ReadonlyNodeZone.length; i++) {
                this.ReadonlyNodeZone[i] = new String(source.ReadonlyNodeZone[i]);
            }
        }
        if (source.InMaintenance != null) {
            this.InMaintenance = new Long(source.InMaintenance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PrimaryNodeZone", this.PrimaryNodeZone);
        this.setParamArraySimple(map, prefix + "SecondaryNodeZone.", this.SecondaryNodeZone);
        this.setParamSimple(map, prefix + "HiddenNodeZone", this.HiddenNodeZone);
        this.setParamArraySimple(map, prefix + "ReadonlyNodeZone.", this.ReadonlyNodeZone);
        this.setParamSimple(map, prefix + "InMaintenance", this.InMaintenance);

    }
}

