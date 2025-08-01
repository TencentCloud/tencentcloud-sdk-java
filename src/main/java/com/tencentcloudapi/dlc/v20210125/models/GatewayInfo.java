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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GatewayInfo extends AbstractModel {

    /**
    * 网关ID，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关名称，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 网关的规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中 5挂起中 6启动中 7隔离中 8隔离 9续费中 10变配中 11冲正中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 计费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
     * Get 网关ID，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayId 网关ID，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关ID，
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayId 网关ID，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关名称，全局唯一
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayName 网关名称，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 网关名称，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayName 网关名称，全局唯一
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 网关的规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 网关的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 网关的规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 网关的规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中 5挂起中 6启动中 7隔离中 8隔离 9续费中 10变配中 11冲正中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中 5挂起中 6启动中 7隔离中 8隔离 9续费中 10变配中 11冲正中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中 5挂起中 6启动中 7隔离中 8隔离 9续费中 10变配中 11冲正中
注意：此字段可能返回 null，表示取不到有效值。
     * @param State -2已删除 -1失败 0初始化中 1挂起 2运行中 3准备删除 4删除中 5挂起中 6启动中 7隔离中 8隔离 9续费中 10变配中 11冲正中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 计费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mode 模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mode 模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    public GatewayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatewayInfo(GatewayInfo source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

