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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRoomMemberRequest extends AbstractModel {

    /**
    * <p>要操作的房间id</p>
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * <p>剔除类型 1-删除房间 2-剔除用户</p>
    */
    @SerializedName("DeleteType")
    @Expose
    private Long DeleteType;

    /**
    * <p>应用id</p>
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * <p>要剔除的用户列表（整型）</p>
    */
    @SerializedName("Uids")
    @Expose
    private String [] Uids;

    /**
    * <p>要剔除的用户列表（字符串类型）</p>
    */
    @SerializedName("StrUids")
    @Expose
    private String [] StrUids;

    /**
     * Get <p>要操作的房间id</p> 
     * @return RoomId <p>要操作的房间id</p>
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set <p>要操作的房间id</p>
     * @param RoomId <p>要操作的房间id</p>
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get <p>剔除类型 1-删除房间 2-剔除用户</p> 
     * @return DeleteType <p>剔除类型 1-删除房间 2-剔除用户</p>
     */
    public Long getDeleteType() {
        return this.DeleteType;
    }

    /**
     * Set <p>剔除类型 1-删除房间 2-剔除用户</p>
     * @param DeleteType <p>剔除类型 1-删除房间 2-剔除用户</p>
     */
    public void setDeleteType(Long DeleteType) {
        this.DeleteType = DeleteType;
    }

    /**
     * Get <p>应用id</p> 
     * @return BizId <p>应用id</p>
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set <p>应用id</p>
     * @param BizId <p>应用id</p>
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get <p>要剔除的用户列表（整型）</p> 
     * @return Uids <p>要剔除的用户列表（整型）</p>
     */
    public String [] getUids() {
        return this.Uids;
    }

    /**
     * Set <p>要剔除的用户列表（整型）</p>
     * @param Uids <p>要剔除的用户列表（整型）</p>
     */
    public void setUids(String [] Uids) {
        this.Uids = Uids;
    }

    /**
     * Get <p>要剔除的用户列表（字符串类型）</p> 
     * @return StrUids <p>要剔除的用户列表（字符串类型）</p>
     */
    public String [] getStrUids() {
        return this.StrUids;
    }

    /**
     * Set <p>要剔除的用户列表（字符串类型）</p>
     * @param StrUids <p>要剔除的用户列表（字符串类型）</p>
     */
    public void setStrUids(String [] StrUids) {
        this.StrUids = StrUids;
    }

    public DeleteRoomMemberRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRoomMemberRequest(DeleteRoomMemberRequest source) {
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.DeleteType != null) {
            this.DeleteType = new Long(source.DeleteType);
        }
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.Uids != null) {
            this.Uids = new String[source.Uids.length];
            for (int i = 0; i < source.Uids.length; i++) {
                this.Uids[i] = new String(source.Uids[i]);
            }
        }
        if (source.StrUids != null) {
            this.StrUids = new String[source.StrUids.length];
            for (int i = 0; i < source.StrUids.length; i++) {
                this.StrUids[i] = new String(source.StrUids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "DeleteType", this.DeleteType);
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArraySimple(map, prefix + "Uids.", this.Uids);
        this.setParamArraySimple(map, prefix + "StrUids.", this.StrUids);

    }
}

