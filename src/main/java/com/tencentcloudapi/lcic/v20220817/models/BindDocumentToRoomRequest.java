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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindDocumentToRoomRequest extends AbstractModel{

    /**
    * 房间ID。
    */
    @SerializedName("RoomId")
    @Expose
    private Long RoomId;

    /**
    * 文档ID。
    */
    @SerializedName("DocumentId")
    @Expose
    private String DocumentId;

    /**
    * 绑定类型。后台可透传到客户端，默认为0。客户端可以根据这个字段实现业务逻辑。
    */
    @SerializedName("BindType")
    @Expose
    private Long BindType;

    /**
     * Get 房间ID。 
     * @return RoomId 房间ID。
     */
    public Long getRoomId() {
        return this.RoomId;
    }

    /**
     * Set 房间ID。
     * @param RoomId 房间ID。
     */
    public void setRoomId(Long RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 文档ID。 
     * @return DocumentId 文档ID。
     */
    public String getDocumentId() {
        return this.DocumentId;
    }

    /**
     * Set 文档ID。
     * @param DocumentId 文档ID。
     */
    public void setDocumentId(String DocumentId) {
        this.DocumentId = DocumentId;
    }

    /**
     * Get 绑定类型。后台可透传到客户端，默认为0。客户端可以根据这个字段实现业务逻辑。 
     * @return BindType 绑定类型。后台可透传到客户端，默认为0。客户端可以根据这个字段实现业务逻辑。
     */
    public Long getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型。后台可透传到客户端，默认为0。客户端可以根据这个字段实现业务逻辑。
     * @param BindType 绑定类型。后台可透传到客户端，默认为0。客户端可以根据这个字段实现业务逻辑。
     */
    public void setBindType(Long BindType) {
        this.BindType = BindType;
    }

    public BindDocumentToRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindDocumentToRoomRequest(BindDocumentToRoomRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new Long(source.RoomId);
        }
        if (source.DocumentId != null) {
            this.DocumentId = new String(source.DocumentId);
        }
        if (source.BindType != null) {
            this.BindType = new Long(source.BindType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "DocumentId", this.DocumentId);
        this.setParamSimple(map, prefix + "BindType", this.BindType);

    }
}

