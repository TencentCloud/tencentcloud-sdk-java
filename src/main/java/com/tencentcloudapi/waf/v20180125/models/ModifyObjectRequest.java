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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyObjectRequest extends AbstractModel {

    /**
    * 修改对象标识
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * 改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * 新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 新的实例ID，如果和已绑定的实例相同认为修改成功
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)
    */
    @SerializedName("Proxy")
    @Expose
    private Long Proxy;

    /**
    * IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * 对象所属集团成员appid
    */
    @SerializedName("MemberAppId")
    @Expose
    private Long MemberAppId;

    /**
    * 对象所属集团成员uin
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

    /**
     * Get 修改对象标识 
     * @return ObjectId 修改对象标识
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set 修改对象标识
     * @param ObjectId 修改对象标识
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get 改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态 
     * @return OpType 改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set 改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态
     * @param OpType 改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get 新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1 
     * @return Status 新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1
     * @param Status 新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 新的实例ID，如果和已绑定的实例相同认为修改成功 
     * @return InstanceId 新的实例ID，如果和已绑定的实例相同认为修改成功
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 新的实例ID，如果和已绑定的实例相同认为修改成功
     * @param InstanceId 新的实例ID，如果和已绑定的实例相同认为修改成功
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效) 
     * @return Proxy 是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)
     */
    public Long getProxy() {
        return this.Proxy;
    }

    /**
     * Set 是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)
     * @param Proxy 是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)
     */
    public void setProxy(Long Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效) 
     * @return IpHeaders IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)
     * @param IpHeaders IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get 对象所属集团成员appid 
     * @return MemberAppId 对象所属集团成员appid
     */
    public Long getMemberAppId() {
        return this.MemberAppId;
    }

    /**
     * Set 对象所属集团成员appid
     * @param MemberAppId 对象所属集团成员appid
     */
    public void setMemberAppId(Long MemberAppId) {
        this.MemberAppId = MemberAppId;
    }

    /**
     * Get 对象所属集团成员uin 
     * @return MemberUin 对象所属集团成员uin
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 对象所属集团成员uin
     * @param MemberUin 对象所属集团成员uin
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
    }

    public ModifyObjectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyObjectRequest(ModifyObjectRequest source) {
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.OpType != null) {
            this.OpType = new String(source.OpType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Proxy != null) {
            this.Proxy = new Long(source.Proxy);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.MemberAppId != null) {
            this.MemberAppId = new Long(source.MemberAppId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new String(source.MemberUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Proxy", this.Proxy);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "MemberAppId", this.MemberAppId);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);

    }
}

