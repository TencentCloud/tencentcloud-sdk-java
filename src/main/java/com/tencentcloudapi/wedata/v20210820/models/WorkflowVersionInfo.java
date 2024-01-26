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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowVersionInfo extends AbstractModel {

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * 版本编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 提交人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Committer")
    @Expose
    private String Committer;

    /**
    * 提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommitTime")
    @Expose
    private String CommitTime;

    /**
    * 提交信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommitDesc")
    @Expose
    private String CommitDesc;

    /**
    * COS地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosUrl")
    @Expose
    private String CosUrl;

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get 版本编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId 版本编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId 版本编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 提交人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Committer 提交人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommitter() {
        return this.Committer;
    }

    /**
     * Set 提交人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Committer 提交人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommitter(String Committer) {
        this.Committer = Committer;
    }

    /**
     * Get 提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommitTime 提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommitTime() {
        return this.CommitTime;
    }

    /**
     * Set 提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommitTime 提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommitTime(String CommitTime) {
        this.CommitTime = CommitTime;
    }

    /**
     * Get 提交信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommitDesc 提交信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCommitDesc() {
        return this.CommitDesc;
    }

    /**
     * Set 提交信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommitDesc 提交信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommitDesc(String CommitDesc) {
        this.CommitDesc = CommitDesc;
    }

    /**
     * Get COS地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosUrl COS地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosUrl() {
        return this.CosUrl;
    }

    /**
     * Set COS地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosUrl COS地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosUrl(String CosUrl) {
        this.CosUrl = CosUrl;
    }

    public WorkflowVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowVersionInfo(WorkflowVersionInfo source) {
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Committer != null) {
            this.Committer = new String(source.Committer);
        }
        if (source.CommitTime != null) {
            this.CommitTime = new String(source.CommitTime);
        }
        if (source.CommitDesc != null) {
            this.CommitDesc = new String(source.CommitDesc);
        }
        if (source.CosUrl != null) {
            this.CosUrl = new String(source.CosUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Committer", this.Committer);
        this.setParamSimple(map, prefix + "CommitTime", this.CommitTime);
        this.setParamSimple(map, prefix + "CommitDesc", this.CommitDesc);
        this.setParamSimple(map, prefix + "CosUrl", this.CosUrl);

    }
}

