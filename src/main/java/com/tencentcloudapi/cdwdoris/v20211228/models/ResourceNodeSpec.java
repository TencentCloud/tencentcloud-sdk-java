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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceNodeSpec extends AbstractModel {

    /**
    * 节点类型，“DATA"数据节点，”COMMON" zookeeper节点
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 节点规格名称，例如 “SCH1","SCH2”等
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * 节点数目
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 磁盘规格描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiskSpec")
    @Expose
    private ResourceNodeDiskSpec DiskSpec;

    /**
    * 云盘是否加密，0不加密/1加密  默认为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Encrypt")
    @Expose
    private Long Encrypt;

    /**
    * 额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extra")
    @Expose
    private SpecExtra Extra;

    /**
    * 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachCBSSpec")
    @Expose
    private ResourceNodeDiskSpec AttachCBSSpec;

    /**
     * Get 节点类型，“DATA"数据节点，”COMMON" zookeeper节点 
     * @return Type 节点类型，“DATA"数据节点，”COMMON" zookeeper节点
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 节点类型，“DATA"数据节点，”COMMON" zookeeper节点
     * @param Type 节点类型，“DATA"数据节点，”COMMON" zookeeper节点
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 节点规格名称，例如 “SCH1","SCH2”等 
     * @return SpecName 节点规格名称，例如 “SCH1","SCH2”等
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set 节点规格名称，例如 “SCH1","SCH2”等
     * @param SpecName 节点规格名称，例如 “SCH1","SCH2”等
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get 节点数目 
     * @return Count 节点数目
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 节点数目
     * @param Count 节点数目
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 磁盘规格描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiskSpec 磁盘规格描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceNodeDiskSpec getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set 磁盘规格描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiskSpec 磁盘规格描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiskSpec(ResourceNodeDiskSpec DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    /**
     * Get 云盘是否加密，0不加密/1加密  默认为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Encrypt 云盘是否加密，0不加密/1加密  默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEncrypt() {
        return this.Encrypt;
    }

    /**
     * Set 云盘是否加密，0不加密/1加密  默认为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param Encrypt 云盘是否加密，0不加密/1加密  默认为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEncrypt(Long Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * Get 额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extra 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecExtra getExtra() {
        return this.Extra;
    }

    /**
     * Set 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extra 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtra(SpecExtra Extra) {
        this.Extra = Extra;
    }

    /**
     * Get 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachCBSSpec 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceNodeDiskSpec getAttachCBSSpec() {
        return this.AttachCBSSpec;
    }

    /**
     * Set 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachCBSSpec 挂载云盘信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachCBSSpec(ResourceNodeDiskSpec AttachCBSSpec) {
        this.AttachCBSSpec = AttachCBSSpec;
    }

    public ResourceNodeSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceNodeSpec(ResourceNodeSpec source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new ResourceNodeDiskSpec(source.DiskSpec);
        }
        if (source.Encrypt != null) {
            this.Encrypt = new Long(source.Encrypt);
        }
        if (source.Extra != null) {
            this.Extra = new SpecExtra(source.Extra);
        }
        if (source.AttachCBSSpec != null) {
            this.AttachCBSSpec = new ResourceNodeDiskSpec(source.AttachCBSSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "DiskSpec.", this.DiskSpec);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamObj(map, prefix + "Extra.", this.Extra);
        this.setParamObj(map, prefix + "AttachCBSSpec.", this.AttachCBSSpec);

    }
}

