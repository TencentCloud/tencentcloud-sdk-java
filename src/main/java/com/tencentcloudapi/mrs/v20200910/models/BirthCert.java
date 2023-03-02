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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BirthCert extends AbstractModel{

    /**
    * 新生儿信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeonatalInfo")
    @Expose
    private NeonatalInfo NeonatalInfo;

    /**
    * 母亲信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MotherInfo")
    @Expose
    private ParentInfo MotherInfo;

    /**
    * 父亲信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FatherInfo")
    @Expose
    private ParentInfo FatherInfo;

    /**
    * 签发信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssueInfo")
    @Expose
    private IssueInfo IssueInfo;

    /**
     * Get 新生儿信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeonatalInfo 新生儿信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NeonatalInfo getNeonatalInfo() {
        return this.NeonatalInfo;
    }

    /**
     * Set 新生儿信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeonatalInfo 新生儿信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeonatalInfo(NeonatalInfo NeonatalInfo) {
        this.NeonatalInfo = NeonatalInfo;
    }

    /**
     * Get 母亲信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MotherInfo 母亲信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParentInfo getMotherInfo() {
        return this.MotherInfo;
    }

    /**
     * Set 母亲信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param MotherInfo 母亲信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMotherInfo(ParentInfo MotherInfo) {
        this.MotherInfo = MotherInfo;
    }

    /**
     * Get 父亲信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FatherInfo 父亲信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParentInfo getFatherInfo() {
        return this.FatherInfo;
    }

    /**
     * Set 父亲信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param FatherInfo 父亲信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFatherInfo(ParentInfo FatherInfo) {
        this.FatherInfo = FatherInfo;
    }

    /**
     * Get 签发信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssueInfo 签发信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IssueInfo getIssueInfo() {
        return this.IssueInfo;
    }

    /**
     * Set 签发信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssueInfo 签发信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssueInfo(IssueInfo IssueInfo) {
        this.IssueInfo = IssueInfo;
    }

    public BirthCert() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BirthCert(BirthCert source) {
        if (source.NeonatalInfo != null) {
            this.NeonatalInfo = new NeonatalInfo(source.NeonatalInfo);
        }
        if (source.MotherInfo != null) {
            this.MotherInfo = new ParentInfo(source.MotherInfo);
        }
        if (source.FatherInfo != null) {
            this.FatherInfo = new ParentInfo(source.FatherInfo);
        }
        if (source.IssueInfo != null) {
            this.IssueInfo = new IssueInfo(source.IssueInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NeonatalInfo.", this.NeonatalInfo);
        this.setParamObj(map, prefix + "MotherInfo.", this.MotherInfo);
        this.setParamObj(map, prefix + "FatherInfo.", this.FatherInfo);
        this.setParamObj(map, prefix + "IssueInfo.", this.IssueInfo);

    }
}

