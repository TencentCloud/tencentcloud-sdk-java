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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAIWorkbenchMessagesResponse extends AbstractModel {

    /**
    * <p>消息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Messages")
    @Expose
    private MessageInfo [] Messages;

    /**
    * <p>下一个游标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
    * <p>还有后续吗</p>
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>消息列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Messages <p>消息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MessageInfo [] getMessages() {
        return this.Messages;
    }

    /**
     * Set <p>消息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Messages <p>消息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessages(MessageInfo [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get <p>下一个游标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextCursor <p>下一个游标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set <p>下一个游标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextCursor <p>下一个游标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    /**
     * Get <p>还有后续吗</p> 
     * @return HasMore <p>还有后续吗</p>
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set <p>还有后续吗</p>
     * @param HasMore <p>还有后续吗</p>
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
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

    public ListAIWorkbenchMessagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAIWorkbenchMessagesResponse(ListAIWorkbenchMessagesResponse source) {
        if (source.Messages != null) {
            this.Messages = new MessageInfo[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new MessageInfo(source.Messages[i]);
            }
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

