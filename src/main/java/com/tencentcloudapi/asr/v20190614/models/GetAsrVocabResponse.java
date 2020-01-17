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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAsrVocabResponse extends AbstractModel{

    /**
    * 热词表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 热词表描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 热词表ID
    */
    @SerializedName("VocabId")
    @Expose
    private String VocabId;

    /**
    * 词权重列表
    */
    @SerializedName("WordWeights")
    @Expose
    private HotWord [] WordWeights;

    /**
    * 词表创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 词表更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 热词表名称 
     * @return Name 热词表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 热词表名称
     * @param Name 热词表名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 热词表描述 
     * @return Description 热词表描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 热词表描述
     * @param Description 热词表描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 热词表ID 
     * @return VocabId 热词表ID
     */
    public String getVocabId() {
        return this.VocabId;
    }

    /**
     * Set 热词表ID
     * @param VocabId 热词表ID
     */
    public void setVocabId(String VocabId) {
        this.VocabId = VocabId;
    }

    /**
     * Get 词权重列表 
     * @return WordWeights 词权重列表
     */
    public HotWord [] getWordWeights() {
        return this.WordWeights;
    }

    /**
     * Set 词权重列表
     * @param WordWeights 词权重列表
     */
    public void setWordWeights(HotWord [] WordWeights) {
        this.WordWeights = WordWeights;
    }

    /**
     * Get 词表创建时间 
     * @return CreateTime 词表创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 词表创建时间
     * @param CreateTime 词表创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 词表更新时间 
     * @return UpdateTime 词表更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 词表更新时间
     * @param UpdateTime 词表更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态 
     * @return State 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
     * @param State 热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态
     */
    public void setState(Long State) {
        this.State = State;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VocabId", this.VocabId);
        this.setParamArrayObj(map, prefix + "WordWeights.", this.WordWeights);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

