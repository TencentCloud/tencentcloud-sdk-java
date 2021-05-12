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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateInstancesRequest extends AbstractModel{

    /**
    * 待销毁的实例ID列表。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 是否定时销毁，默认为否。
    */
    @SerializedName("TerminateDelay")
    @Expose
    private Boolean TerminateDelay;

    /**
    * 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
    */
    @SerializedName("TerminateTime")
    @Expose
    private String TerminateTime;

    /**
    * 是否关联删除已绑定的弹性网卡和弹性IP，默认为true。
当为true时，一并删除弹性网卡和弹性IP；
当为false时，只销毁主机，保留弹性网卡和弹性IP。
    */
    @SerializedName("AssociatedResourceDestroy")
    @Expose
    private Boolean AssociatedResourceDestroy;

    /**
     * Get 待销毁的实例ID列表。 
     * @return InstanceIdSet 待销毁的实例ID列表。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 待销毁的实例ID列表。
     * @param InstanceIdSet 待销毁的实例ID列表。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 是否定时销毁，默认为否。 
     * @return TerminateDelay 是否定时销毁，默认为否。
     */
    public Boolean getTerminateDelay() {
        return this.TerminateDelay;
    }

    /**
     * Set 是否定时销毁，默认为否。
     * @param TerminateDelay 是否定时销毁，默认为否。
     */
    public void setTerminateDelay(Boolean TerminateDelay) {
        this.TerminateDelay = TerminateDelay;
    }

    /**
     * Get 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。 
     * @return TerminateTime 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
     */
    public String getTerminateTime() {
        return this.TerminateTime;
    }

    /**
     * Set 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
     * @param TerminateTime 定时销毁的时间，格式形如："2019-08-05 12:01:30"，若非定时销毁，则此参数被忽略。
     */
    public void setTerminateTime(String TerminateTime) {
        this.TerminateTime = TerminateTime;
    }

    /**
     * Get 是否关联删除已绑定的弹性网卡和弹性IP，默认为true。
当为true时，一并删除弹性网卡和弹性IP；
当为false时，只销毁主机，保留弹性网卡和弹性IP。 
     * @return AssociatedResourceDestroy 是否关联删除已绑定的弹性网卡和弹性IP，默认为true。
当为true时，一并删除弹性网卡和弹性IP；
当为false时，只销毁主机，保留弹性网卡和弹性IP。
     */
    public Boolean getAssociatedResourceDestroy() {
        return this.AssociatedResourceDestroy;
    }

    /**
     * Set 是否关联删除已绑定的弹性网卡和弹性IP，默认为true。
当为true时，一并删除弹性网卡和弹性IP；
当为false时，只销毁主机，保留弹性网卡和弹性IP。
     * @param AssociatedResourceDestroy 是否关联删除已绑定的弹性网卡和弹性IP，默认为true。
当为true时，一并删除弹性网卡和弹性IP；
当为false时，只销毁主机，保留弹性网卡和弹性IP。
     */
    public void setAssociatedResourceDestroy(Boolean AssociatedResourceDestroy) {
        this.AssociatedResourceDestroy = AssociatedResourceDestroy;
    }

    public TerminateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateInstancesRequest(TerminateInstancesRequest source) {
        if (source.InstanceIdSet != null) {
            this.InstanceIdSet = new String[source.InstanceIdSet.length];
            for (int i = 0; i < source.InstanceIdSet.length; i++) {
                this.InstanceIdSet[i] = new String(source.InstanceIdSet[i]);
            }
        }
        if (source.TerminateDelay != null) {
            this.TerminateDelay = new Boolean(source.TerminateDelay);
        }
        if (source.TerminateTime != null) {
            this.TerminateTime = new String(source.TerminateTime);
        }
        if (source.AssociatedResourceDestroy != null) {
            this.AssociatedResourceDestroy = new Boolean(source.AssociatedResourceDestroy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "TerminateDelay", this.TerminateDelay);
        this.setParamSimple(map, prefix + "TerminateTime", this.TerminateTime);
        this.setParamSimple(map, prefix + "AssociatedResourceDestroy", this.AssociatedResourceDestroy);

    }
}

