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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EMRProductConfigSettings  extends AbstractModel{

    /**
    * 集群软件信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftInfo")
    @Expose
    private String [] SoftInfo;

    /**
    * master节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterNodeSize")
    @Expose
    private Integer MasterNodeSize;

    /**
    * core节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreNodeSize")
    @Expose
    private Integer CoreNodeSize;

    /**
    * task节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNodeSize")
    @Expose
    private Integer TaskNodeSize;

    /**
    * common节点数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComNodeSize")
    @Expose
    private Integer ComNodeSize;

    /**
    * master规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterResourceSpec")
    @Expose
    private NodeSpec MasterResourceSpec;

    /**
    * core规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoreResourceSpec")
    @Expose
    private NodeSpec CoreResourceSpec;

    /**
    * task规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskResourceSpec")
    @Expose
    private NodeSpec TaskResourceSpec;

    /**
    * common规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonResourceSpec")
    @Expose
    private NodeSpec CommonResourceSpec;

    /**
    * 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Oncos")
    @Expose
    private Boolean Oncos;

    /**
    * COS配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("COSSettings")
    @Expose
    private COSSettings COSSettings;

    /**
     * 获取集群软件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return SoftInfo 集群软件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSoftInfo() {
        return this.SoftInfo;
    }

    /**
     * 设置集群软件信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftInfo 集群软件信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftInfo(String [] SoftInfo) {
        this.SoftInfo = SoftInfo;
    }

    /**
     * 获取master节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return MasterNodeSize master节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getMasterNodeSize() {
        return this.MasterNodeSize;
    }

    /**
     * 设置master节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterNodeSize master节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterNodeSize(Integer MasterNodeSize) {
        this.MasterNodeSize = MasterNodeSize;
    }

    /**
     * 获取core节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return CoreNodeSize core节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getCoreNodeSize() {
        return this.CoreNodeSize;
    }

    /**
     * 设置core节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreNodeSize core节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreNodeSize(Integer CoreNodeSize) {
        this.CoreNodeSize = CoreNodeSize;
    }

    /**
     * 获取task节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return TaskNodeSize task节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getTaskNodeSize() {
        return this.TaskNodeSize;
    }

    /**
     * 设置task节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNodeSize task节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNodeSize(Integer TaskNodeSize) {
        this.TaskNodeSize = TaskNodeSize;
    }

    /**
     * 获取common节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return ComNodeSize common节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getComNodeSize() {
        return this.ComNodeSize;
    }

    /**
     * 设置common节点数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComNodeSize common节点数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComNodeSize(Integer ComNodeSize) {
        this.ComNodeSize = ComNodeSize;
    }

    /**
     * 获取master规格
注意：此字段可能返回 null，表示取不到有效值。
     * @return MasterResourceSpec master规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpec getMasterResourceSpec() {
        return this.MasterResourceSpec;
    }

    /**
     * 设置master规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterResourceSpec master规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterResourceSpec(NodeSpec MasterResourceSpec) {
        this.MasterResourceSpec = MasterResourceSpec;
    }

    /**
     * 获取core规格
注意：此字段可能返回 null，表示取不到有效值。
     * @return CoreResourceSpec core规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpec getCoreResourceSpec() {
        return this.CoreResourceSpec;
    }

    /**
     * 设置core规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoreResourceSpec core规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoreResourceSpec(NodeSpec CoreResourceSpec) {
        this.CoreResourceSpec = CoreResourceSpec;
    }

    /**
     * 获取task规格
注意：此字段可能返回 null，表示取不到有效值。
     * @return TaskResourceSpec task规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpec getTaskResourceSpec() {
        return this.TaskResourceSpec;
    }

    /**
     * 设置task规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskResourceSpec task规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskResourceSpec(NodeSpec TaskResourceSpec) {
        this.TaskResourceSpec = TaskResourceSpec;
    }

    /**
     * 获取common规格
注意：此字段可能返回 null，表示取不到有效值。
     * @return CommonResourceSpec common规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeSpec getCommonResourceSpec() {
        return this.CommonResourceSpec;
    }

    /**
     * 设置common规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonResourceSpec common规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonResourceSpec(NodeSpec CommonResourceSpec) {
        this.CommonResourceSpec = CommonResourceSpec;
    }

    /**
     * 获取是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
     * @return Oncos 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOncos() {
        return this.Oncos;
    }

    /**
     * 设置是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
     * @param Oncos 是否使用COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOncos(Boolean Oncos) {
        this.Oncos = Oncos;
    }

    /**
     * 获取COS配置
注意：此字段可能返回 null，表示取不到有效值。
     * @return COSSettings COS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public COSSettings getCOSSettings() {
        return this.COSSettings;
    }

    /**
     * 设置COS配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param COSSettings COS配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCOSSettings(COSSettings COSSettings) {
        this.COSSettings = COSSettings;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SoftInfo.", this.SoftInfo);
        this.setParamSimple(map, prefix + "MasterNodeSize", this.MasterNodeSize);
        this.setParamSimple(map, prefix + "CoreNodeSize", this.CoreNodeSize);
        this.setParamSimple(map, prefix + "TaskNodeSize", this.TaskNodeSize);
        this.setParamSimple(map, prefix + "ComNodeSize", this.ComNodeSize);
        this.setParamObj(map, prefix + "MasterResourceSpec.", this.MasterResourceSpec);
        this.setParamObj(map, prefix + "CoreResourceSpec.", this.CoreResourceSpec);
        this.setParamObj(map, prefix + "TaskResourceSpec.", this.TaskResourceSpec);
        this.setParamObj(map, prefix + "CommonResourceSpec.", this.CommonResourceSpec);
        this.setParamSimple(map, prefix + "Oncos", this.Oncos);
        this.setParamObj(map, prefix + "COSSettings.", this.COSSettings);

    }
}

