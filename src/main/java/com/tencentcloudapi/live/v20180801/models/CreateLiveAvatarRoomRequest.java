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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLiveAvatarRoomRequest extends AbstractModel {

    /**
    * <p>直播间名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>操作者。</p>
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * <p>形象ID</p>
    */
    @SerializedName("AvatarKey")
    @Expose
    private String AvatarKey;

    /**
    * <p>音色ID</p>
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * <p>房间模式</p><p>枚举值：</p><ul><li>INTERACT： 交互模式</li><li>FREE： 自由模式</li><li>NORMAL： 普通模式</li></ul>
    */
    @SerializedName("LiveMode")
    @Expose
    private String LiveMode;

    /**
     * Get <p>直播间名称。</p> 
     * @return Name <p>直播间名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>直播间名称。</p>
     * @param Name <p>直播间名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>操作者。</p> 
     * @return Operator <p>操作者。</p>
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作者。</p>
     * @param Operator <p>操作者。</p>
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>形象ID</p> 
     * @return AvatarKey <p>形象ID</p>
     */
    public String getAvatarKey() {
        return this.AvatarKey;
    }

    /**
     * Set <p>形象ID</p>
     * @param AvatarKey <p>形象ID</p>
     */
    public void setAvatarKey(String AvatarKey) {
        this.AvatarKey = AvatarKey;
    }

    /**
     * Get <p>音色ID</p> 
     * @return TimbreKey <p>音色ID</p>
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set <p>音色ID</p>
     * @param TimbreKey <p>音色ID</p>
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get <p>房间模式</p><p>枚举值：</p><ul><li>INTERACT： 交互模式</li><li>FREE： 自由模式</li><li>NORMAL： 普通模式</li></ul> 
     * @return LiveMode <p>房间模式</p><p>枚举值：</p><ul><li>INTERACT： 交互模式</li><li>FREE： 自由模式</li><li>NORMAL： 普通模式</li></ul>
     */
    public String getLiveMode() {
        return this.LiveMode;
    }

    /**
     * Set <p>房间模式</p><p>枚举值：</p><ul><li>INTERACT： 交互模式</li><li>FREE： 自由模式</li><li>NORMAL： 普通模式</li></ul>
     * @param LiveMode <p>房间模式</p><p>枚举值：</p><ul><li>INTERACT： 交互模式</li><li>FREE： 自由模式</li><li>NORMAL： 普通模式</li></ul>
     */
    public void setLiveMode(String LiveMode) {
        this.LiveMode = LiveMode;
    }

    public CreateLiveAvatarRoomRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLiveAvatarRoomRequest(CreateLiveAvatarRoomRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.AvatarKey != null) {
            this.AvatarKey = new String(source.AvatarKey);
        }
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.LiveMode != null) {
            this.LiveMode = new String(source.LiveMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "AvatarKey", this.AvatarKey);
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "LiveMode", this.LiveMode);

    }
}

