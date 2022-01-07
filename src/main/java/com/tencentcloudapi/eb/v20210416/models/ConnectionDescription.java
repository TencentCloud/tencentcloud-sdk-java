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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectionDescription extends AbstractModel{

    /**
    * 资源qcs六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)
    */
    @SerializedName("ResourceDescription")
    @Expose
    private String ResourceDescription;

    /**
    * apigw参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APIGWParams")
    @Expose
    private APIGWParams APIGWParams;

    /**
    * ckafka参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CkafkaParams")
    @Expose
    private CkafkaParams CkafkaParams;

    /**
     * Get 资源qcs六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606) 
     * @return ResourceDescription 资源qcs六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)
     */
    public String getResourceDescription() {
        return this.ResourceDescription;
    }

    /**
     * Set 资源qcs六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)
     * @param ResourceDescription 资源qcs六段式，更多参考 [资源六段式](https://cloud.tencent.com/document/product/598/10606)
     */
    public void setResourceDescription(String ResourceDescription) {
        this.ResourceDescription = ResourceDescription;
    }

    /**
     * Get apigw参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APIGWParams apigw参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public APIGWParams getAPIGWParams() {
        return this.APIGWParams;
    }

    /**
     * Set apigw参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param APIGWParams apigw参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPIGWParams(APIGWParams APIGWParams) {
        this.APIGWParams = APIGWParams;
    }

    /**
     * Get ckafka参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CkafkaParams ckafka参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CkafkaParams getCkafkaParams() {
        return this.CkafkaParams;
    }

    /**
     * Set ckafka参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CkafkaParams ckafka参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCkafkaParams(CkafkaParams CkafkaParams) {
        this.CkafkaParams = CkafkaParams;
    }

    public ConnectionDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionDescription(ConnectionDescription source) {
        if (source.ResourceDescription != null) {
            this.ResourceDescription = new String(source.ResourceDescription);
        }
        if (source.APIGWParams != null) {
            this.APIGWParams = new APIGWParams(source.APIGWParams);
        }
        if (source.CkafkaParams != null) {
            this.CkafkaParams = new CkafkaParams(source.CkafkaParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceDescription", this.ResourceDescription);
        this.setParamObj(map, prefix + "APIGWParams.", this.APIGWParams);
        this.setParamObj(map, prefix + "CkafkaParams.", this.CkafkaParams);

    }
}

