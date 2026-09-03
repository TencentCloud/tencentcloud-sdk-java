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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Vocab extends AbstractModel {

    /**
    * <p>热词表名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>热词表描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>热词表ID</p>
    */
    @SerializedName("VocabId")
    @Expose
    private String VocabId;

    /**
    * <p>词权重列表</p>
    */
    @SerializedName("WordWeights")
    @Expose
    private HotWord [] WordWeights;

    /**
    * <p>词表创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>词表更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
     * Get <p>热词表名称</p> 
     * @return Name <p>热词表名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>热词表名称</p>
     * @param Name <p>热词表名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>热词表描述</p> 
     * @return Description <p>热词表描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>热词表描述</p>
     * @param Description <p>热词表描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>热词表ID</p> 
     * @return VocabId <p>热词表ID</p>
     */
    public String getVocabId() {
        return this.VocabId;
    }

    /**
     * Set <p>热词表ID</p>
     * @param VocabId <p>热词表ID</p>
     */
    public void setVocabId(String VocabId) {
        this.VocabId = VocabId;
    }

    /**
     * Get <p>词权重列表</p> 
     * @return WordWeights <p>词权重列表</p>
     */
    public HotWord [] getWordWeights() {
        return this.WordWeights;
    }

    /**
     * Set <p>词权重列表</p>
     * @param WordWeights <p>词权重列表</p>
     */
    public void setWordWeights(HotWord [] WordWeights) {
        this.WordWeights = WordWeights;
    }

    /**
     * Get <p>词表创建时间</p> 
     * @return CreateTime <p>词表创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>词表创建时间</p>
     * @param CreateTime <p>词表创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>词表更新时间</p> 
     * @return UpdateTime <p>词表更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>词表更新时间</p>
     * @param UpdateTime <p>词表更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态</p> 
     * @return State <p>热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态</p>
     * @param State <p>热词表状态，1为默认状态即在识别时默认加载该热词表进行识别，0为初始状态</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    public Vocab() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Vocab(Vocab source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.VocabId != null) {
            this.VocabId = new String(source.VocabId);
        }
        if (source.WordWeights != null) {
            this.WordWeights = new HotWord[source.WordWeights.length];
            for (int i = 0; i < source.WordWeights.length; i++) {
                this.WordWeights[i] = new HotWord(source.WordWeights[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
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

    }
}

