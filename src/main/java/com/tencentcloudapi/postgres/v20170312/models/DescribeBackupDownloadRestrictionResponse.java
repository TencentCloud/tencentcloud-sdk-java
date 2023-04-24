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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupDownloadRestrictionResponse extends AbstractModel{

    /**
    * 备份文件下载限制类型，NONE 无限制，内外网都可以下载；INTRANET 只允许内网下载；CUSTOMIZE 自定义限制下载的vpc或ip。
    */
    @SerializedName("RestrictionType")
    @Expose
    private String RestrictionType;

    /**
    * vpc限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcRestrictionEffect")
    @Expose
    private String VpcRestrictionEffect;

    /**
    * 允许或拒绝下载备份文件的vpcId列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcIdSet")
    @Expose
    private String [] VpcIdSet;

    /**
    * ip限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpRestrictionEffect")
    @Expose
    private String IpRestrictionEffect;

    /**
    * 允许或拒绝下载备份文件的ip列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpSet")
    @Expose
    private String [] IpSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 备份文件下载限制类型，NONE 无限制，内外网都可以下载；INTRANET 只允许内网下载；CUSTOMIZE 自定义限制下载的vpc或ip。 
     * @return RestrictionType 备份文件下载限制类型，NONE 无限制，内外网都可以下载；INTRANET 只允许内网下载；CUSTOMIZE 自定义限制下载的vpc或ip。
     */
    public String getRestrictionType() {
        return this.RestrictionType;
    }

    /**
     * Set 备份文件下载限制类型，NONE 无限制，内外网都可以下载；INTRANET 只允许内网下载；CUSTOMIZE 自定义限制下载的vpc或ip。
     * @param RestrictionType 备份文件下载限制类型，NONE 无限制，内外网都可以下载；INTRANET 只允许内网下载；CUSTOMIZE 自定义限制下载的vpc或ip。
     */
    public void setRestrictionType(String RestrictionType) {
        this.RestrictionType = RestrictionType;
    }

    /**
     * Get vpc限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcRestrictionEffect vpc限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcRestrictionEffect() {
        return this.VpcRestrictionEffect;
    }

    /**
     * Set vpc限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcRestrictionEffect vpc限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcRestrictionEffect(String VpcRestrictionEffect) {
        this.VpcRestrictionEffect = VpcRestrictionEffect;
    }

    /**
     * Get 允许或拒绝下载备份文件的vpcId列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcIdSet 允许或拒绝下载备份文件的vpcId列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getVpcIdSet() {
        return this.VpcIdSet;
    }

    /**
     * Set 允许或拒绝下载备份文件的vpcId列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcIdSet 允许或拒绝下载备份文件的vpcId列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcIdSet(String [] VpcIdSet) {
        this.VpcIdSet = VpcIdSet;
    }

    /**
     * Get ip限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpRestrictionEffect ip限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIpRestrictionEffect() {
        return this.IpRestrictionEffect;
    }

    /**
     * Set ip限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpRestrictionEffect ip限制效力，ALLOW 允许；DENY 拒绝。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpRestrictionEffect(String IpRestrictionEffect) {
        this.IpRestrictionEffect = IpRestrictionEffect;
    }

    /**
     * Get 允许或拒绝下载备份文件的ip列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpSet 允许或拒绝下载备份文件的ip列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpSet() {
        return this.IpSet;
    }

    /**
     * Set 允许或拒绝下载备份文件的ip列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpSet 允许或拒绝下载备份文件的ip列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpSet(String [] IpSet) {
        this.IpSet = IpSet;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBackupDownloadRestrictionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupDownloadRestrictionResponse(DescribeBackupDownloadRestrictionResponse source) {
        if (source.RestrictionType != null) {
            this.RestrictionType = new String(source.RestrictionType);
        }
        if (source.VpcRestrictionEffect != null) {
            this.VpcRestrictionEffect = new String(source.VpcRestrictionEffect);
        }
        if (source.VpcIdSet != null) {
            this.VpcIdSet = new String[source.VpcIdSet.length];
            for (int i = 0; i < source.VpcIdSet.length; i++) {
                this.VpcIdSet[i] = new String(source.VpcIdSet[i]);
            }
        }
        if (source.IpRestrictionEffect != null) {
            this.IpRestrictionEffect = new String(source.IpRestrictionEffect);
        }
        if (source.IpSet != null) {
            this.IpSet = new String[source.IpSet.length];
            for (int i = 0; i < source.IpSet.length; i++) {
                this.IpSet[i] = new String(source.IpSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RestrictionType", this.RestrictionType);
        this.setParamSimple(map, prefix + "VpcRestrictionEffect", this.VpcRestrictionEffect);
        this.setParamArraySimple(map, prefix + "VpcIdSet.", this.VpcIdSet);
        this.setParamSimple(map, prefix + "IpRestrictionEffect", this.IpRestrictionEffect);
        this.setParamArraySimple(map, prefix + "IpSet.", this.IpSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

