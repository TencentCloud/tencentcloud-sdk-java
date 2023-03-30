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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExpansionNodeConfigOverview extends AbstractModel{

    /**
    * 节点机型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 扩容实例所在的位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 节点[计费类型](https://cloud.tencent.com/document/product/213/2180)。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * 私有网络相关信息配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;

    /**
    * 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 公网带宽相关信息设置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 节点系统盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 节点数据盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
     * Get 节点机型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 节点机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 节点机型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 节点机型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 扩容实例所在的位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Placement 扩容实例所在的位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 扩容实例所在的位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Placement 扩容实例所在的位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 节点[计费类型](https://cloud.tencent.com/document/product/213/2180)。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargeType 节点[计费类型](https://cloud.tencent.com/document/product/213/2180)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set 节点[计费类型](https://cloud.tencent.com/document/product/213/2180)。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargeType 节点[计费类型](https://cloud.tencent.com/document/product/213/2180)。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargePrepaid 预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月节点的购买时长、是否设置自动续费等属性。若指定节点的付费模式为预付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get 私有网络相关信息配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VirtualPrivateCloud 私有网络相关信息配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * Set 私有网络相关信息配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VirtualPrivateCloud 私有网络相关信息配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * Get 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageId 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageId 指定有效的[镜像](https://cloud.tencent.com/document/product/213/4940)ID，格式形如`img-xxx`。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 公网带宽相关信息设置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InternetAccessible 公网带宽相关信息设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 公网带宽相关信息设置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InternetAccessible 公网带宽相关信息设置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Get 节点系统盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SystemDisk 节点系统盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * Set 节点系统盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SystemDisk 节点系统盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * Get 节点数据盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataDisks 节点数据盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * Set 节点数据盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataDisks 节点数据盘配置信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    public ExpansionNodeConfigOverview() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExpansionNodeConfigOverview(ExpansionNodeConfigOverview source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Placement != null) {
            this.Placement = new Placement(source.Placement);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.VirtualPrivateCloud != null) {
            this.VirtualPrivateCloud = new VirtualPrivateCloud(source.VirtualPrivateCloud);
        }
        if (source.ImageId != null) {
            this.ImageId = new String(source.ImageId);
        }
        if (source.InternetAccessible != null) {
            this.InternetAccessible = new InternetAccessible(source.InternetAccessible);
        }
        if (source.SystemDisk != null) {
            this.SystemDisk = new SystemDisk(source.SystemDisk);
        }
        if (source.DataDisks != null) {
            this.DataDisks = new DataDisk[source.DataDisks.length];
            for (int i = 0; i < source.DataDisks.length; i++) {
                this.DataDisks[i] = new DataDisk(source.DataDisks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);

    }
}

