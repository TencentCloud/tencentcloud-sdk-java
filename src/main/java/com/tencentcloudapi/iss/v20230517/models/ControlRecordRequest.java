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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlRecordRequest extends AbstractModel{

    /**
    * 通道ID（录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
    */
    @SerializedName("ChannelId")
    @Expose
    private String ChannelId;

    /**
    * 录像会话 ID （ 录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
    */
    @SerializedName("Session")
    @Expose
    private String Session;

    /**
    * 录像操作类型 （play:播放；pause:暂停 ；stop:关闭）
    */
    @SerializedName("ControlAction")
    @Expose
    private String ControlAction;

    /**
    * 跳转进度 （ 参数应大于等于0，跳转到录像开始时间的相对时间（单位秒），例如0就是跳转到录像开始的时间,不可以和 Scale 参数同时出现）
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 速度 （ 范围（0.25,0.5,1,2,4,8），不可以和 Pos 参数同时出现）
    */
    @SerializedName("Scale")
    @Expose
    private Float Scale;

    /**
     * Get 通道ID（录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}） 
     * @return ChannelId 通道ID（录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
     */
    public String getChannelId() {
        return this.ChannelId;
    }

    /**
     * Set 通道ID（录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
     * @param ChannelId 通道ID（录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
     */
    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    /**
     * Get 录像会话 ID （ 录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}） 
     * @return Session 录像会话 ID （ 录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
     */
    public String getSession() {
        return this.Session;
    }

    /**
     * Set 录像会话 ID （ 录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
     * @param Session 录像会话 ID （ 录像播放地址格式 https://${domain}/live/${ChannelId}@${Session}）
     */
    public void setSession(String Session) {
        this.Session = Session;
    }

    /**
     * Get 录像操作类型 （play:播放；pause:暂停 ；stop:关闭） 
     * @return ControlAction 录像操作类型 （play:播放；pause:暂停 ；stop:关闭）
     */
    public String getControlAction() {
        return this.ControlAction;
    }

    /**
     * Set 录像操作类型 （play:播放；pause:暂停 ；stop:关闭）
     * @param ControlAction 录像操作类型 （play:播放；pause:暂停 ；stop:关闭）
     */
    public void setControlAction(String ControlAction) {
        this.ControlAction = ControlAction;
    }

    /**
     * Get 跳转进度 （ 参数应大于等于0，跳转到录像开始时间的相对时间（单位秒），例如0就是跳转到录像开始的时间,不可以和 Scale 参数同时出现） 
     * @return Position 跳转进度 （ 参数应大于等于0，跳转到录像开始时间的相对时间（单位秒），例如0就是跳转到录像开始的时间,不可以和 Scale 参数同时出现）
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 跳转进度 （ 参数应大于等于0，跳转到录像开始时间的相对时间（单位秒），例如0就是跳转到录像开始的时间,不可以和 Scale 参数同时出现）
     * @param Position 跳转进度 （ 参数应大于等于0，跳转到录像开始时间的相对时间（单位秒），例如0就是跳转到录像开始的时间,不可以和 Scale 参数同时出现）
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 速度 （ 范围（0.25,0.5,1,2,4,8），不可以和 Pos 参数同时出现） 
     * @return Scale 速度 （ 范围（0.25,0.5,1,2,4,8），不可以和 Pos 参数同时出现）
     */
    public Float getScale() {
        return this.Scale;
    }

    /**
     * Set 速度 （ 范围（0.25,0.5,1,2,4,8），不可以和 Pos 参数同时出现）
     * @param Scale 速度 （ 范围（0.25,0.5,1,2,4,8），不可以和 Pos 参数同时出现）
     */
    public void setScale(Float Scale) {
        this.Scale = Scale;
    }

    public ControlRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlRecordRequest(ControlRecordRequest source) {
        if (source.ChannelId != null) {
            this.ChannelId = new String(source.ChannelId);
        }
        if (source.Session != null) {
            this.Session = new String(source.Session);
        }
        if (source.ControlAction != null) {
            this.ControlAction = new String(source.ControlAction);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.Scale != null) {
            this.Scale = new Float(source.Scale);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelId", this.ChannelId);
        this.setParamSimple(map, prefix + "Session", this.Session);
        this.setParamSimple(map, prefix + "ControlAction", this.ControlAction);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Scale", this.Scale);

    }
}

