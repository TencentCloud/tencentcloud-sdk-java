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

public class Channel extends AbstractModel {

    /**
    * <p>渠道ID</p>
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * <p>渠道状态（仅B端）：1-未发布，2-运行中，3-已下线（与ConnectStatus互斥）</p>
    */
    @SerializedName("ChannelStatus")
    @Expose
    private Long ChannelStatus;

    /**
    * <p>连接状态（仅C端）：1-初始，2-连接成功，3-连接失败（与ChannelStatus互斥）</p>
    */
    @SerializedName("ConnectStatus")
    @Expose
    private Long ConnectStatus;

    /**
    * <p>创建时间（Unix秒）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>渠道规格</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Spec")
    @Expose
    private ChannelSpec Spec;

    /**
    * <p>更新时间（Unix秒）</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>最后更新人</p>
    */
    @SerializedName("Updater")
    @Expose
    private String Updater;

    /**
     * Get <p>渠道ID</p> 
     * @return ChannelId <p>渠道ID</p>
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set <p>渠道ID</p>
     * @param ChannelId <p>渠道ID</p>
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get <p>渠道状态（仅B端）：1-未发布，2-运行中，3-已下线（与ConnectStatus互斥）</p> 
     * @return ChannelStatus <p>渠道状态（仅B端）：1-未发布，2-运行中，3-已下线（与ConnectStatus互斥）</p>
     */
    public Long getChannelStatus() {
        return this.ChannelStatus;
    }

    /**
     * Set <p>渠道状态（仅B端）：1-未发布，2-运行中，3-已下线（与ConnectStatus互斥）</p>
     * @param ChannelStatus <p>渠道状态（仅B端）：1-未发布，2-运行中，3-已下线（与ConnectStatus互斥）</p>
     */
    public void setChannelStatus(Long ChannelStatus) {
        this.ChannelStatus = ChannelStatus;
    }

    /**
     * Get <p>连接状态（仅C端）：1-初始，2-连接成功，3-连接失败（与ChannelStatus互斥）</p> 
     * @return ConnectStatus <p>连接状态（仅C端）：1-初始，2-连接成功，3-连接失败（与ChannelStatus互斥）</p>
     */
    public Long getConnectStatus() {
        return this.ConnectStatus;
    }

    /**
     * Set <p>连接状态（仅C端）：1-初始，2-连接成功，3-连接失败（与ChannelStatus互斥）</p>
     * @param ConnectStatus <p>连接状态（仅C端）：1-初始，2-连接成功，3-连接失败（与ChannelStatus互斥）</p>
     */
    public void setConnectStatus(Long ConnectStatus) {
        this.ConnectStatus = ConnectStatus;
    }

    /**
     * Get <p>创建时间（Unix秒）</p> 
     * @return CreateTime <p>创建时间（Unix秒）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（Unix秒）</p>
     * @param CreateTime <p>创建时间（Unix秒）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>渠道规格</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Spec <p>渠道规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ChannelSpec getSpec() {
        return this.Spec;
    }

    /**
     * Set <p>渠道规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Spec <p>渠道规格</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpec(ChannelSpec Spec) {
        this.Spec = Spec;
    }

    /**
     * Get <p>更新时间（Unix秒）</p> 
     * @return UpdateTime <p>更新时间（Unix秒）</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（Unix秒）</p>
     * @param UpdateTime <p>更新时间（Unix秒）</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>最后更新人</p> 
     * @return Updater <p>最后更新人</p>
     */
    public String getUpdater() {
        return this.Updater;
    }

    /**
     * Set <p>最后更新人</p>
     * @param Updater <p>最后更新人</p>
     */
    public void setUpdater(String Updater) {
        this.Updater = Updater;
    }

    public Channel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Channel(Channel source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.ChannelStatus != null) {
            this.ChannelStatus = new Long(source.ChannelStatus);
        }
        if (source.ConnectStatus != null) {
            this.ConnectStatus = new Long(source.ConnectStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Spec != null) {
            this.Spec = new ChannelSpec(source.Spec);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Updater != null) {
            this.Updater = new String(source.Updater);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "ChannelStatus", this.ChannelStatus);
        this.setParamSimple(map, prefix + "ConnectStatus", this.ConnectStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Spec.", this.Spec);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Updater", this.Updater);

    }
}

