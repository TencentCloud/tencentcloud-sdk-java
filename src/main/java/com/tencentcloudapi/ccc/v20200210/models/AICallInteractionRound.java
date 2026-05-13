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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallInteractionRound extends AbstractModel {

    /**
    * <p>本轮对话的唯一标识 Id</p>
    */
    @SerializedName("RoundId")
    @Expose
    private String RoundId;

    /**
    * <p>轮次</p>
    */
    @SerializedName("RoundIndex")
    @Expose
    private Long RoundIndex;

    /**
    * <p>用户回复分类的标签， json序列化后的表示</p>
    */
    @SerializedName("Tags")
    @Expose
    private String Tags;

    /**
    * <p>本轮涉及到的消息内容</p>
    */
    @SerializedName("Messages")
    @Expose
    private AIRoundMessage [] Messages;

    /**
    * <p>本轮对话在画布中经过的节点路径</p>
    */
    @SerializedName("Paths")
    @Expose
    private AIRoundPath [] Paths;

    /**
     * Get <p>本轮对话的唯一标识 Id</p> 
     * @return RoundId <p>本轮对话的唯一标识 Id</p>
     */
    public String getRoundId() {
        return this.RoundId;
    }

    /**
     * Set <p>本轮对话的唯一标识 Id</p>
     * @param RoundId <p>本轮对话的唯一标识 Id</p>
     */
    public void setRoundId(String RoundId) {
        this.RoundId = RoundId;
    }

    /**
     * Get <p>轮次</p> 
     * @return RoundIndex <p>轮次</p>
     */
    public Long getRoundIndex() {
        return this.RoundIndex;
    }

    /**
     * Set <p>轮次</p>
     * @param RoundIndex <p>轮次</p>
     */
    public void setRoundIndex(Long RoundIndex) {
        this.RoundIndex = RoundIndex;
    }

    /**
     * Get <p>用户回复分类的标签， json序列化后的表示</p> 
     * @return Tags <p>用户回复分类的标签， json序列化后的表示</p>
     */
    public String getTags() {
        return this.Tags;
    }

    /**
     * Set <p>用户回复分类的标签， json序列化后的表示</p>
     * @param Tags <p>用户回复分类的标签， json序列化后的表示</p>
     */
    public void setTags(String Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>本轮涉及到的消息内容</p> 
     * @return Messages <p>本轮涉及到的消息内容</p>
     */
    public AIRoundMessage [] getMessages() {
        return this.Messages;
    }

    /**
     * Set <p>本轮涉及到的消息内容</p>
     * @param Messages <p>本轮涉及到的消息内容</p>
     */
    public void setMessages(AIRoundMessage [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get <p>本轮对话在画布中经过的节点路径</p> 
     * @return Paths <p>本轮对话在画布中经过的节点路径</p>
     */
    public AIRoundPath [] getPaths() {
        return this.Paths;
    }

    /**
     * Set <p>本轮对话在画布中经过的节点路径</p>
     * @param Paths <p>本轮对话在画布中经过的节点路径</p>
     */
    public void setPaths(AIRoundPath [] Paths) {
        this.Paths = Paths;
    }

    public AICallInteractionRound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallInteractionRound(AICallInteractionRound source) {
        if (source.RoundId != null) {
            this.RoundId = new String(source.RoundId);
        }
        if (source.RoundIndex != null) {
            this.RoundIndex = new Long(source.RoundIndex);
        }
        if (source.Tags != null) {
            this.Tags = new String(source.Tags);
        }
        if (source.Messages != null) {
            this.Messages = new AIRoundMessage[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new AIRoundMessage(source.Messages[i]);
            }
        }
        if (source.Paths != null) {
            this.Paths = new AIRoundPath[source.Paths.length];
            for (int i = 0; i < source.Paths.length; i++) {
                this.Paths[i] = new AIRoundPath(source.Paths[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoundId", this.RoundId);
        this.setParamSimple(map, prefix + "RoundIndex", this.RoundIndex);
        this.setParamSimple(map, prefix + "Tags", this.Tags);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamArrayObj(map, prefix + "Paths.", this.Paths);

    }
}

