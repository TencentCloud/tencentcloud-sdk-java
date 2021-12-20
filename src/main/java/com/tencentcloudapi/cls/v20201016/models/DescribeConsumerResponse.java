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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerResponse extends AbstractModel{

    /**
    * 投递任务是否生效
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * 是否投递日志的元数据信息
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private ConsumerContent Content;

    /**
    * CKafka的描述
    */
    @SerializedName("Ckafka")
    @Expose
    private Ckafka Ckafka;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 投递任务是否生效 
     * @return Effective 投递任务是否生效
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set 投递任务是否生效
     * @param Effective 投递任务是否生效
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get 是否投递日志的元数据信息 
     * @return NeedContent 是否投递日志的元数据信息
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set 是否投递日志的元数据信息
     * @param NeedContent 是否投递日志的元数据信息
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 如果需要投递元数据信息，元数据信息的描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(ConsumerContent Content) {
        this.Content = Content;
    }

    /**
     * Get CKafka的描述 
     * @return Ckafka CKafka的描述
     */
    public Ckafka getCkafka() {
        return this.Ckafka;
    }

    /**
     * Set CKafka的描述
     * @param Ckafka CKafka的描述
     */
    public void setCkafka(Ckafka Ckafka) {
        this.Ckafka = Ckafka;
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

    public DescribeConsumerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerResponse(DescribeConsumerResponse source) {
        if (source.Effective != null) {
            this.Effective = new Boolean(source.Effective);
        }
        if (source.NeedContent != null) {
            this.NeedContent = new Boolean(source.NeedContent);
        }
        if (source.Content != null) {
            this.Content = new ConsumerContent(source.Content);
        }
        if (source.Ckafka != null) {
            this.Ckafka = new Ckafka(source.Ckafka);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

