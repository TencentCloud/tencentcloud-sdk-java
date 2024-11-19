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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceActiveResult extends AbstractModel {

    /**
    * 模板ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * SN信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sn")
    @Expose
    private String Sn;

    /**
    * 设备激活状态，0：激活成功；9800020：设备数超出限制；9800040：资源包类型和设备类型不匹配；9800039：资源包余额不足；9800037：激活码序号已使用；9800038：设备有效期超出限制；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 模板ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 模板ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get SN信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sn SN信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSn() {
        return this.Sn;
    }

    /**
     * Set SN信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sn SN信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSn(String Sn) {
        this.Sn = Sn;
    }

    /**
     * Get 设备激活状态，0：激活成功；9800020：设备数超出限制；9800040：资源包类型和设备类型不匹配；9800039：资源包余额不足；9800037：激活码序号已使用；9800038：设备有效期超出限制；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrCode 设备激活状态，0：激活成功；9800020：设备数超出限制；9800040：资源包类型和设备类型不匹配；9800039：资源包余额不足；9800037：激活码序号已使用；9800038：设备有效期超出限制；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 设备激活状态，0：激活成功；9800020：设备数超出限制；9800040：资源包类型和设备类型不匹配；9800039：资源包余额不足；9800037：激活码序号已使用；9800038：设备有效期超出限制；
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrCode 设备激活状态，0：激活成功；9800020：设备数超出限制；9800040：资源包类型和设备类型不匹配；9800039：资源包余额不足；9800037：激活码序号已使用；9800038：设备有效期超出限制；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public DeviceActiveResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceActiveResult(DeviceActiveResult source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.Sn != null) {
            this.Sn = new String(source.Sn);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "Sn", this.Sn);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

