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

public class ModifyResourcesTagsResponse extends AbstractModel{

    /**
    * 成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessList")
    @Expose
    private String [] SuccessList;

    /**
    * 失败的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailList")
    @Expose
    private String [] FailList;

    /**
    * 部分成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartSuccessList")
    @Expose
    private String [] PartSuccessList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessList 成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSuccessList() {
        return this.SuccessList;
    }

    /**
     * Set 成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessList 成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessList(String [] SuccessList) {
        this.SuccessList = SuccessList;
    }

    /**
     * Get 失败的资源id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailList 失败的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailList() {
        return this.FailList;
    }

    /**
     * Set 失败的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailList 失败的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailList(String [] FailList) {
        this.FailList = FailList;
    }

    /**
     * Get 部分成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartSuccessList 部分成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPartSuccessList() {
        return this.PartSuccessList;
    }

    /**
     * Set 部分成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartSuccessList 部分成功的资源id列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartSuccessList(String [] PartSuccessList) {
        this.PartSuccessList = PartSuccessList;
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

    public ModifyResourcesTagsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyResourcesTagsResponse(ModifyResourcesTagsResponse source) {
        if (source.SuccessList != null) {
            this.SuccessList = new String[source.SuccessList.length];
            for (int i = 0; i < source.SuccessList.length; i++) {
                this.SuccessList[i] = new String(source.SuccessList[i]);
            }
        }
        if (source.FailList != null) {
            this.FailList = new String[source.FailList.length];
            for (int i = 0; i < source.FailList.length; i++) {
                this.FailList[i] = new String(source.FailList[i]);
            }
        }
        if (source.PartSuccessList != null) {
            this.PartSuccessList = new String[source.PartSuccessList.length];
            for (int i = 0; i < source.PartSuccessList.length; i++) {
                this.PartSuccessList[i] = new String(source.PartSuccessList[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessList.", this.SuccessList);
        this.setParamArraySimple(map, prefix + "FailList.", this.FailList);
        this.setParamArraySimple(map, prefix + "PartSuccessList.", this.PartSuccessList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

