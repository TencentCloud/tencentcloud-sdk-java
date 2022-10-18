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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageTransferOutInfo extends AbstractModel{

    /**
    * 权益包ID。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 转移码。
    */
    @SerializedName("TransferCode")
    @Expose
    private String TransferCode;

    /**
    * 本次转移点数。
    */
    @SerializedName("TransferCount")
    @Expose
    private Long TransferCount;

    /**
    * 转入的PackageID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceivePackageId")
    @Expose
    private String ReceivePackageId;

    /**
    * 本次转移过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 本次转移生成时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 本次转移更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 转移状态。
    */
    @SerializedName("TransferStatus")
    @Expose
    private String TransferStatus;

    /**
    * 接收者uin。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverUin")
    @Expose
    private Long ReceiverUin;

    /**
    * 接收时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiveTime")
    @Expose
    private String ReceiveTime;

    /**
     * Get 权益包ID。 
     * @return PackageId 权益包ID。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 权益包ID。
     * @param PackageId 权益包ID。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 转移码。 
     * @return TransferCode 转移码。
     */
    public String getTransferCode() {
        return this.TransferCode;
    }

    /**
     * Set 转移码。
     * @param TransferCode 转移码。
     */
    public void setTransferCode(String TransferCode) {
        this.TransferCode = TransferCode;
    }

    /**
     * Get 本次转移点数。 
     * @return TransferCount 本次转移点数。
     */
    public Long getTransferCount() {
        return this.TransferCount;
    }

    /**
     * Set 本次转移点数。
     * @param TransferCount 本次转移点数。
     */
    public void setTransferCount(Long TransferCount) {
        this.TransferCount = TransferCount;
    }

    /**
     * Get 转入的PackageID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceivePackageId 转入的PackageID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReceivePackageId() {
        return this.ReceivePackageId;
    }

    /**
     * Set 转入的PackageID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceivePackageId 转入的PackageID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceivePackageId(String ReceivePackageId) {
        this.ReceivePackageId = ReceivePackageId;
    }

    /**
     * Get 本次转移过期时间。 
     * @return ExpireTime 本次转移过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 本次转移过期时间。
     * @param ExpireTime 本次转移过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 本次转移生成时间。 
     * @return CreateTime 本次转移生成时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 本次转移生成时间。
     * @param CreateTime 本次转移生成时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 本次转移更新时间。 
     * @return UpdateTime 本次转移更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 本次转移更新时间。
     * @param UpdateTime 本次转移更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 转移状态。 
     * @return TransferStatus 转移状态。
     */
    public String getTransferStatus() {
        return this.TransferStatus;
    }

    /**
     * Set 转移状态。
     * @param TransferStatus 转移状态。
     */
    public void setTransferStatus(String TransferStatus) {
        this.TransferStatus = TransferStatus;
    }

    /**
     * Get 接收者uin。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverUin 接收者uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReceiverUin() {
        return this.ReceiverUin;
    }

    /**
     * Set 接收者uin。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverUin 接收者uin。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverUin(Long ReceiverUin) {
        this.ReceiverUin = ReceiverUin;
    }

    /**
     * Get 接收时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiveTime 接收时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReceiveTime() {
        return this.ReceiveTime;
    }

    /**
     * Set 接收时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiveTime 接收时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiveTime(String ReceiveTime) {
        this.ReceiveTime = ReceiveTime;
    }

    public PackageTransferOutInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageTransferOutInfo(PackageTransferOutInfo source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.TransferCode != null) {
            this.TransferCode = new String(source.TransferCode);
        }
        if (source.TransferCount != null) {
            this.TransferCount = new Long(source.TransferCount);
        }
        if (source.ReceivePackageId != null) {
            this.ReceivePackageId = new String(source.ReceivePackageId);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TransferStatus != null) {
            this.TransferStatus = new String(source.TransferStatus);
        }
        if (source.ReceiverUin != null) {
            this.ReceiverUin = new Long(source.ReceiverUin);
        }
        if (source.ReceiveTime != null) {
            this.ReceiveTime = new String(source.ReceiveTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "TransferCode", this.TransferCode);
        this.setParamSimple(map, prefix + "TransferCount", this.TransferCount);
        this.setParamSimple(map, prefix + "ReceivePackageId", this.ReceivePackageId);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TransferStatus", this.TransferStatus);
        this.setParamSimple(map, prefix + "ReceiverUin", this.ReceiverUin);
        this.setParamSimple(map, prefix + "ReceiveTime", this.ReceiveTime);

    }
}

