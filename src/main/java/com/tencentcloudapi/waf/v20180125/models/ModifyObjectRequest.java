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
    * <p>修改对象标识</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态</p>
    */
    @SerializedName("OpType")
    @Expose
    private String OpType;

    /**
    * <p>新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>新的实例ID，如果和已绑定的实例相同认为修改成功</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)</p>
    */
    @SerializedName("Proxy")
    @Expose
    private Long Proxy;

    /**
    * <p>IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)</p>
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * <p>对象所属集团成员appid</p>
    */
    @SerializedName("MemberAppId")
    @Expose
    private Long MemberAppId;

    /**
    * <p>对象所属集团成员uin</p>
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>修改对象标识</p> 
     * @return ObjectId <p>修改对象标识</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>修改对象标识</p>
     * @param ObjectId <p>修改对象标识</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态</p> 
     * @return OpType <p>改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态</p>
     */
    public String getOpType() {
        return this.OpType;
    }

    /**
     * Set <p>改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态</p>
     * @param OpType <p>改动作类型:Status修改开关，InstanceId绑定实例, Proxy设置代理状态</p>
     */
    public void setOpType(String OpType) {
        this.OpType = OpType;
    }

    /**
     * Get <p>新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1</p> 
     * @return Status <p>新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1</p>
     * @param Status <p>新的Waf开关状态，如果和已有状态相同认为修改成功。状态可以为0或1</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>新的实例ID，如果和已绑定的实例相同认为修改成功</p> 
     * @return InstanceId <p>新的实例ID，如果和已绑定的实例相同认为修改成功</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>新的实例ID，如果和已绑定的实例相同认为修改成功</p>
     * @param InstanceId <p>新的实例ID，如果和已绑定的实例相同认为修改成功</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)</p> 
     * @return Proxy <p>是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)</p>
     */
    public Long getProxy() {
        return this.Proxy;
    }

    /**
     * Set <p>是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)</p>
     * @param Proxy <p>是否开启代理，0:不开启,1:以XFF的第一个IP地址作为客户端IP,2:以remote_addr作为客户端IP,3:从指定的头部字段获取客户端IP，字段通过IpHeaders字段给出(OpType为Status或Proxy时，该值有效)</p>
     */
    public void setProxy(Long Proxy) {
        this.Proxy = Proxy;
    }

    /**
     * Get <p>IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)</p> 
     * @return IpHeaders <p>IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)</p>
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set <p>IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)</p>
     * @param IpHeaders <p>IsCdn=3时，需要填此参数，表示自定义header(OpType为Status或Proxy时，该值有效)</p>
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get <p>对象所属集团成员appid</p> 
     * @return MemberAppId <p>对象所属集团成员appid</p>
     */
    public Long getMemberAppId() {
        return this.MemberAppId;
    }

    /**
     * Set <p>对象所属集团成员appid</p>
     * @param MemberAppId <p>对象所属集团成员appid</p>
     */
    public void setMemberAppId(Long MemberAppId) {
        this.MemberAppId = MemberAppId;
    }

    /**
     * Get <p>对象所属集团成员uin</p> 
     * @return MemberUin <p>对象所属集团成员uin</p>
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set <p>对象所属集团成员uin</p>
     * @param MemberUin <p>对象所属集团成员uin</p>
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get <p>标签信息</p> 
     * @return Tags <p>标签信息</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签信息</p>
     * @param Tags <p>标签信息</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
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
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

