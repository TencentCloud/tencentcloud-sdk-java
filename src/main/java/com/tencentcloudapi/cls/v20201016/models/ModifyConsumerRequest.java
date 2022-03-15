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

public class ModifyConsumerRequest extends AbstractModel{

    /**
    * 投递任务绑定的日志主题 ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递任务是否生效，默认不生效
    */
    @SerializedName("Effective")
    @Expose
    private Boolean Effective;

    /**
    * 是否投递日志的元数据信息，默认为 false
    */
    @SerializedName("NeedContent")
    @Expose
    private Boolean NeedContent;

    /**
    * 如果需要投递元数据信息，元数据信息的描述
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
     * Get 投递任务绑定的日志主题 ID 
     * @return TopicId 投递任务绑定的日志主题 ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 投递任务绑定的日志主题 ID
     * @param TopicId 投递任务绑定的日志主题 ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递任务是否生效，默认不生效 
     * @return Effective 投递任务是否生效，默认不生效
     */
    public Boolean getEffective() {
        return this.Effective;
    }

    /**
     * Set 投递任务是否生效，默认不生效
     * @param Effective 投递任务是否生效，默认不生效
     */
    public void setEffective(Boolean Effective) {
        this.Effective = Effective;
    }

    /**
     * Get 是否投递日志的元数据信息，默认为 false 
     * @return NeedContent 是否投递日志的元数据信息，默认为 false
     */
    public Boolean getNeedContent() {
        return this.NeedContent;
    }

    /**
     * Set 是否投递日志的元数据信息，默认为 false
     * @param NeedContent 是否投递日志的元数据信息，默认为 false
     */
    public void setNeedContent(Boolean NeedContent) {
        this.NeedContent = NeedContent;
    }

    /**
     * Get 如果需要投递元数据信息，元数据信息的描述 
     * @return Content 如果需要投递元数据信息，元数据信息的描述
     */
    public ConsumerContent getContent() {
        return this.Content;
    }

    /**
     * Set 如果需要投递元数据信息，元数据信息的描述
     * @param Content 如果需要投递元数据信息，元数据信息的描述
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

    public ModifyConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyConsumerRequest(ModifyConsumerRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Effective", this.Effective);
        this.setParamSimple(map, prefix + "NeedContent", this.NeedContent);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Ckafka.", this.Ckafka);

    }
}

