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

public class GetRecognizeVocabV3Response extends AbstractModel {

    /**
    * <p>词表名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>词表 id</p>
    */
    @SerializedName("VocabId")
    @Expose
    private String VocabId;

    /**
    * <p>热词+权重数组</p>
    */
    @SerializedName("WordWeights")
    @Expose
    private HotWord [] WordWeights;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>是否设置默认词表</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>词表名称</p> 
     * @return Name <p>词表名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>词表名称</p>
     * @param Name <p>词表名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>词表 id</p> 
     * @return VocabId <p>词表 id</p>
     */
    public String getVocabId() {
        return this.VocabId;
    }

    /**
     * Set <p>词表 id</p>
     * @param VocabId <p>词表 id</p>
     */
    public void setVocabId(String VocabId) {
        this.VocabId = VocabId;
    }

    /**
     * Get <p>热词+权重数组</p> 
     * @return WordWeights <p>热词+权重数组</p>
     */
    public HotWord [] getWordWeights() {
        return this.WordWeights;
    }

    /**
     * Set <p>热词+权重数组</p>
     * @param WordWeights <p>热词+权重数组</p>
     */
    public void setWordWeights(HotWord [] WordWeights) {
        this.WordWeights = WordWeights;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>是否设置默认词表</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul> 
     * @return State <p>是否设置默认词表</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>是否设置默认词表</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     * @param State <p>是否设置默认词表</p><p>枚举值：</p><ul><li>0： 否</li><li>1： 是</li></ul>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetRecognizeVocabV3Response() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetRecognizeVocabV3Response(GetRecognizeVocabV3Response source) {
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
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

