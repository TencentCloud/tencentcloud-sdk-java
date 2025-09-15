/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOutputStorage extends AbstractModel {

    /**
    * 媒体处理输出对象存储位置的类型，支持：
<li>COS：COS存储</li>
<li>AWS-S3：AWS 存储，只适用于AWS任务，且要求同区域</li>
<li> VOD：点播专业版 </li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosOutputStorage")
    @Expose
    private CosOutputStorage CosOutputStorage;

    /**
    * 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3OutputStorage")
    @Expose
    private S3OutputStorage S3OutputStorage;

    /**
    * 当 Type 为 VOD 时有效，则该项为必填，表示媒体处理 点播专业版 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VODOutputStorage")
    @Expose
    private VODOutputStorage VODOutputStorage;

    /**
     * Get 媒体处理输出对象存储位置的类型，支持：
<li>COS：COS存储</li>
<li>AWS-S3：AWS 存储，只适用于AWS任务，且要求同区域</li>
<li> VOD：点播专业版 </li> 
     * @return Type 媒体处理输出对象存储位置的类型，支持：
<li>COS：COS存储</li>
<li>AWS-S3：AWS 存储，只适用于AWS任务，且要求同区域</li>
<li> VOD：点播专业版 </li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 媒体处理输出对象存储位置的类型，支持：
<li>COS：COS存储</li>
<li>AWS-S3：AWS 存储，只适用于AWS任务，且要求同区域</li>
<li> VOD：点播专业版 </li>
     * @param Type 媒体处理输出对象存储位置的类型，支持：
<li>COS：COS存储</li>
<li>AWS-S3：AWS 存储，只适用于AWS任务，且要求同区域</li>
<li> VOD：点播专业版 </li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 输出位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosOutputStorage 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosOutputStorage getCosOutputStorage() {
        return this.CosOutputStorage;
    }

    /**
     * Set 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosOutputStorage 当 Type 为 COS 时有效，则该项为必填，表示媒体处理 COS 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosOutputStorage(CosOutputStorage CosOutputStorage) {
        this.CosOutputStorage = CosOutputStorage;
    }

    /**
     * Get 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 输出位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3OutputStorage 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public S3OutputStorage getS3OutputStorage() {
        return this.S3OutputStorage;
    }

    /**
     * Set 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3OutputStorage 当 Type 为 AWS-S3 时有效，则该项为必填，表示媒体处理 AWS S3 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3OutputStorage(S3OutputStorage S3OutputStorage) {
        this.S3OutputStorage = S3OutputStorage;
    }

    /**
     * Get 当 Type 为 VOD 时有效，则该项为必填，表示媒体处理 点播专业版 输出位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VODOutputStorage 当 Type 为 VOD 时有效，则该项为必填，表示媒体处理 点播专业版 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VODOutputStorage getVODOutputStorage() {
        return this.VODOutputStorage;
    }

    /**
     * Set 当 Type 为 VOD 时有效，则该项为必填，表示媒体处理 点播专业版 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VODOutputStorage 当 Type 为 VOD 时有效，则该项为必填，表示媒体处理 点播专业版 输出位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVODOutputStorage(VODOutputStorage VODOutputStorage) {
        this.VODOutputStorage = VODOutputStorage;
    }

    public TaskOutputStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOutputStorage(TaskOutputStorage source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CosOutputStorage != null) {
            this.CosOutputStorage = new CosOutputStorage(source.CosOutputStorage);
        }
        if (source.S3OutputStorage != null) {
            this.S3OutputStorage = new S3OutputStorage(source.S3OutputStorage);
        }
        if (source.VODOutputStorage != null) {
            this.VODOutputStorage = new VODOutputStorage(source.VODOutputStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "CosOutputStorage.", this.CosOutputStorage);
        this.setParamObj(map, prefix + "S3OutputStorage.", this.S3OutputStorage);
        this.setParamObj(map, prefix + "VODOutputStorage.", this.VODOutputStorage);

    }
}

