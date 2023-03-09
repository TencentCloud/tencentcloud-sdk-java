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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTrigger extends AbstractModel{

    /**
    * 触发器的类型，可选值：
<li>CosFileUpload：COS触发</li>
<li>AwsS3FileUpload：AWS触发，目前只支持转码任务。只有编排支持，工作流不支持。  </li>


    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosFileUploadTrigger")
    @Expose
    private CosFileUploadTrigger CosFileUploadTrigger;

    /**
    * 当 Type 为 AwsS3FileUpload 时必填且有效，为 AWS S3 触发规则。

注意：目前AWS的S3、对应触发队列SQS、回调队列SQS的秘钥需要一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AwsS3FileUploadTrigger")
    @Expose
    private AwsS3FileUploadTrigger AwsS3FileUploadTrigger;

    /**
     * Get 触发器的类型，可选值：
<li>CosFileUpload：COS触发</li>
<li>AwsS3FileUpload：AWS触发，目前只支持转码任务。只有编排支持，工作流不支持。  </li>

 
     * @return Type 触发器的类型，可选值：
<li>CosFileUpload：COS触发</li>
<li>AwsS3FileUpload：AWS触发，目前只支持转码任务。只有编排支持，工作流不支持。  </li>


     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发器的类型，可选值：
<li>CosFileUpload：COS触发</li>
<li>AwsS3FileUpload：AWS触发，目前只支持转码任务。只有编排支持，工作流不支持。  </li>


     * @param Type 触发器的类型，可选值：
<li>CosFileUpload：COS触发</li>
<li>AwsS3FileUpload：AWS触发，目前只支持转码任务。只有编排支持，工作流不支持。  </li>


     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosFileUploadTrigger 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosFileUploadTrigger getCosFileUploadTrigger() {
        return this.CosFileUploadTrigger;
    }

    /**
     * Set 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosFileUploadTrigger 当 Type 为 CosFileUpload 时必填且有效，为 COS 触发规则。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosFileUploadTrigger(CosFileUploadTrigger CosFileUploadTrigger) {
        this.CosFileUploadTrigger = CosFileUploadTrigger;
    }

    /**
     * Get 当 Type 为 AwsS3FileUpload 时必填且有效，为 AWS S3 触发规则。

注意：目前AWS的S3、对应触发队列SQS、回调队列SQS的秘钥需要一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AwsS3FileUploadTrigger 当 Type 为 AwsS3FileUpload 时必填且有效，为 AWS S3 触发规则。

注意：目前AWS的S3、对应触发队列SQS、回调队列SQS的秘钥需要一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AwsS3FileUploadTrigger getAwsS3FileUploadTrigger() {
        return this.AwsS3FileUploadTrigger;
    }

    /**
     * Set 当 Type 为 AwsS3FileUpload 时必填且有效，为 AWS S3 触发规则。

注意：目前AWS的S3、对应触发队列SQS、回调队列SQS的秘钥需要一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AwsS3FileUploadTrigger 当 Type 为 AwsS3FileUpload 时必填且有效，为 AWS S3 触发规则。

注意：目前AWS的S3、对应触发队列SQS、回调队列SQS的秘钥需要一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAwsS3FileUploadTrigger(AwsS3FileUploadTrigger AwsS3FileUploadTrigger) {
        this.AwsS3FileUploadTrigger = AwsS3FileUploadTrigger;
    }

    public WorkflowTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTrigger(WorkflowTrigger source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosFileUploadTrigger != null) {
            this.CosFileUploadTrigger = new CosFileUploadTrigger(source.CosFileUploadTrigger);
        }
        if (source.AwsS3FileUploadTrigger != null) {
            this.AwsS3FileUploadTrigger = new AwsS3FileUploadTrigger(source.AwsS3FileUploadTrigger);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosFileUploadTrigger.", this.CosFileUploadTrigger);
        this.setParamObj(map, prefix + "AwsS3FileUploadTrigger.", this.AwsS3FileUploadTrigger);

    }
}

