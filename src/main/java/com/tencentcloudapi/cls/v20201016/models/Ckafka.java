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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ckafka extends AbstractModel {

    /**
    * Ckafka 的 InstanceId。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取实例id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Ckafka 的 TopicName。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicName。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicName。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * Ckafka 的 Vip。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vip字段可为空。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Ckafka 的 Vport。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip port信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vport字段可为空。
    */
    @SerializedName("Vport")
    @Expose
    private String Vport;

    /**
    * Ckafka 的 InstanceName。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取InstanceName。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取InstanceName。
- 如果是通过 角色ARN 方式创建投递任务，则InstanceName字段可为空。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Ckafka 的 TopicId。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicId。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicId。
- 如果是通过 角色ARN 方式创建投递任务，则TopicId字段可为空。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
     * Get Ckafka 的 InstanceId。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取实例id。 
     * @return InstanceId Ckafka 的 InstanceId。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取实例id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Ckafka 的 InstanceId。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取实例id。
     * @param InstanceId Ckafka 的 InstanceId。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取实例id。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取实例id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Ckafka 的 TopicName。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicName。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicName。 
     * @return TopicName Ckafka 的 TopicName。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicName。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicName。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Ckafka 的 TopicName。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicName。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicName。
     * @param TopicName Ckafka 的 TopicName。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicName。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicName。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get Ckafka 的 Vip。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vip字段可为空。 
     * @return Vip Ckafka 的 Vip。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vip字段可为空。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Ckafka 的 Vip。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vip字段可为空。
     * @param Vip Ckafka 的 Vip。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vip字段可为空。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Ckafka 的 Vport。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip port信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vport字段可为空。 
     * @return Vport Ckafka 的 Vport。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip port信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vport字段可为空。
     */
    public String getVport() {
        return this.Vport;
    }

    /**
     * Set Ckafka 的 Vport。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip port信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vport字段可为空。
     * @param Vport Ckafka 的 Vport。
- 通过 [获取实例属性 ](https://cloud.tencent.com/document/product/597/40836) 获取vip port信息。
- 如果是通过 角色ARN 方式创建投递任务，则Vport字段可为空。
     */
    public void setVport(String Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Ckafka 的 InstanceName。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取InstanceName。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取InstanceName。
- 如果是通过 角色ARN 方式创建投递任务，则InstanceName字段可为空。 
     * @return InstanceName Ckafka 的 InstanceName。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取InstanceName。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取InstanceName。
- 如果是通过 角色ARN 方式创建投递任务，则InstanceName字段可为空。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Ckafka 的 InstanceName。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取InstanceName。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取InstanceName。
- 如果是通过 角色ARN 方式创建投递任务，则InstanceName字段可为空。
     * @param InstanceName Ckafka 的 InstanceName。
- 通过 [获取实例列表信息](https://cloud.tencent.com/document/product/597/40835) 获取InstanceName。
- 通过 [创建实例](https://cloud.tencent.com/document/product/597/53207) 获取InstanceName。
- 如果是通过 角色ARN 方式创建投递任务，则InstanceName字段可为空。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Ckafka 的 TopicId。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicId。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicId。
- 如果是通过 角色ARN 方式创建投递任务，则TopicId字段可为空。 
     * @return TopicId Ckafka 的 TopicId。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicId。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicId。
- 如果是通过 角色ARN 方式创建投递任务，则TopicId字段可为空。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Ckafka 的 TopicId。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicId。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicId。
- 如果是通过 角色ARN 方式创建投递任务，则TopicId字段可为空。
     * @param TopicId Ckafka 的 TopicId。
- 通过 [创建 Topic](https://cloud.tencent.com/document/product/597/73566) 获得TopicId。
- 通过 [获取主题列表](https://cloud.tencent.com/document/product/597/40847) 获得TopicId。
- 如果是通过 角色ARN 方式创建投递任务，则TopicId字段可为空。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    public Ckafka() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ckafka(Ckafka source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new String(source.Vport);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);

    }
}

