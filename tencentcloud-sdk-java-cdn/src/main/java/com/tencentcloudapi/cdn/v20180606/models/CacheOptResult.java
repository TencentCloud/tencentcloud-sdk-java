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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheOptResult extends AbstractModel{

    /**
    * 成功的url列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessUrls")
    @Expose
    private String [] SuccessUrls;

    /**
    * 失败的url列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailUrls")
    @Expose
    private String [] FailUrls;

    /**
     * Get 成功的url列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessUrls 成功的url列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSuccessUrls() {
        return this.SuccessUrls;
    }

    /**
     * Set 成功的url列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessUrls 成功的url列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessUrls(String [] SuccessUrls) {
        this.SuccessUrls = SuccessUrls;
    }

    /**
     * Get 失败的url列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailUrls 失败的url列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFailUrls() {
        return this.FailUrls;
    }

    /**
     * Set 失败的url列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailUrls 失败的url列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailUrls(String [] FailUrls) {
        this.FailUrls = FailUrls;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SuccessUrls.", this.SuccessUrls);
        this.setParamArraySimple(map, prefix + "FailUrls.", this.FailUrls);

    }
}

