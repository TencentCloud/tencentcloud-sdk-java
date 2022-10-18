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

public class PackageInfo extends AbstractModel{

    /**
    * 权益包ID。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 权益包内权益点总量。
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 权益包内权益点余量。
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * 权益包名称。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 权益点是转入时，来源信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceUin")
    @Expose
    private Long SourceUin;

    /**
    * 权益点状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 过期时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 生成时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 来源类型。
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 转移信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferOutInfos")
    @Expose
    private PackageTransferOutInfo [] TransferOutInfos;

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
     * Get 权益包内权益点总量。 
     * @return Total 权益包内权益点总量。
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 权益包内权益点总量。
     * @param Total 权益包内权益点总量。
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 权益包内权益点余量。 
     * @return Balance 权益包内权益点余量。
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set 权益包内权益点余量。
     * @param Balance 权益包内权益点余量。
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 权益包名称。 
     * @return Type 权益包名称。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 权益包名称。
     * @param Type 权益包名称。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 权益点是转入时，来源信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceUin 权益点是转入时，来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceUin() {
        return this.SourceUin;
    }

    /**
     * Set 权益点是转入时，来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceUin 权益点是转入时，来源信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceUin(Long SourceUin) {
        this.SourceUin = SourceUin;
    }

    /**
     * Get 权益点状态。 
     * @return Status 权益点状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 权益点状态。
     * @param Status 权益点状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 过期时间。 
     * @return ExpireTime 过期时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间。
     * @param ExpireTime 过期时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 生成时间。 
     * @return CreateTime 生成时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 生成时间。
     * @param CreateTime 生成时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 来源类型。 
     * @return SourceType 来源类型。
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 来源类型。
     * @param SourceType 来源类型。
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 转移信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferOutInfos 转移信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PackageTransferOutInfo [] getTransferOutInfos() {
        return this.TransferOutInfos;
    }

    /**
     * Set 转移信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferOutInfos 转移信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferOutInfos(PackageTransferOutInfo [] TransferOutInfos) {
        this.TransferOutInfos = TransferOutInfos;
    }

    public PackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageInfo(PackageInfo source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SourceUin != null) {
            this.SourceUin = new Long(source.SourceUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.TransferOutInfos != null) {
            this.TransferOutInfos = new PackageTransferOutInfo[source.TransferOutInfos.length];
            for (int i = 0; i < source.TransferOutInfos.length; i++) {
                this.TransferOutInfos[i] = new PackageTransferOutInfo(source.TransferOutInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceUin", this.SourceUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamArrayObj(map, prefix + "TransferOutInfos.", this.TransferOutInfos);

    }
}

