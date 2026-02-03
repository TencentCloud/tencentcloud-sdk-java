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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudBaseGWAPIRequest extends AbstractModel {

    /**
    * Service ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * API Path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * API类型（1表示云函数，2表示容器）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * API Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * APIId，如果非空，表示修改绑定Path
    */
    @SerializedName("APIId")
    @Expose
    private String APIId;

    /**
    * 自定义值通用字段（当Type为容器时必填）
    */
    @SerializedName("Custom")
    @Expose
    private String Custom;

    /**
    * 认证开关 1为开启 2为关闭
    */
    @SerializedName("AuthSwitch")
    @Expose
    private Long AuthSwitch;

    /**
    * 是否开启多地域
    */
    @SerializedName("EnableRegion")
    @Expose
    private Boolean EnableRegion;

    /**
    * 是否启用统一域名
    */
    @SerializedName("EnableUnion")
    @Expose
    private Boolean EnableUnion;

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 访问类型："OA", "PUBLIC", "MINIAPP", "VPC" （不传默认PUBLIC+MINIAPP+VPC）
    */
    @SerializedName("AccessTypes")
    @Expose
    private String [] AccessTypes;

    /**
    * 是否开启路径透传，默认true表示短路径，即不开启路径透传(已弃用)
    */
    @SerializedName("IsShortPath")
    @Expose
    private Boolean IsShortPath;

    /**
    * 路径透传，默认0关闭，1开启，2关闭
    */
    @SerializedName("PathTransmission")
    @Expose
    private Long PathTransmission;

    /**
    * 跨域校验，默认0开启，1开启，2关闭
    */
    @SerializedName("EnableCheckAcrossDomain")
    @Expose
    private Long EnableCheckAcrossDomain;

    /**
    * 静态托管资源目录
    */
    @SerializedName("StaticFileDirectory")
    @Expose
    private String StaticFileDirectory;

    /**
     * Get Service ID 
     * @return ServiceId Service ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Service ID
     * @param ServiceId Service ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get API Path 
     * @return Path API Path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set API Path
     * @param Path API Path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get API类型（1表示云函数，2表示容器） 
     * @return Type API类型（1表示云函数，2表示容器）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set API类型（1表示云函数，2表示容器）
     * @param Type API类型（1表示云函数，2表示容器）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get API Name 
     * @return Name API Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set API Name
     * @param Name API Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get APIId，如果非空，表示修改绑定Path 
     * @return APIId APIId，如果非空，表示修改绑定Path
     */
    public String getAPIId() {
        return this.APIId;
    }

    /**
     * Set APIId，如果非空，表示修改绑定Path
     * @param APIId APIId，如果非空，表示修改绑定Path
     */
    public void setAPIId(String APIId) {
        this.APIId = APIId;
    }

    /**
     * Get 自定义值通用字段（当Type为容器时必填） 
     * @return Custom 自定义值通用字段（当Type为容器时必填）
     */
    public String getCustom() {
        return this.Custom;
    }

    /**
     * Set 自定义值通用字段（当Type为容器时必填）
     * @param Custom 自定义值通用字段（当Type为容器时必填）
     */
    public void setCustom(String Custom) {
        this.Custom = Custom;
    }

    /**
     * Get 认证开关 1为开启 2为关闭 
     * @return AuthSwitch 认证开关 1为开启 2为关闭
     */
    public Long getAuthSwitch() {
        return this.AuthSwitch;
    }

    /**
     * Set 认证开关 1为开启 2为关闭
     * @param AuthSwitch 认证开关 1为开启 2为关闭
     */
    public void setAuthSwitch(Long AuthSwitch) {
        this.AuthSwitch = AuthSwitch;
    }

    /**
     * Get 是否开启多地域 
     * @return EnableRegion 是否开启多地域
     */
    public Boolean getEnableRegion() {
        return this.EnableRegion;
    }

    /**
     * Set 是否开启多地域
     * @param EnableRegion 是否开启多地域
     */
    public void setEnableRegion(Boolean EnableRegion) {
        this.EnableRegion = EnableRegion;
    }

    /**
     * Get 是否启用统一域名 
     * @return EnableUnion 是否启用统一域名
     */
    public Boolean getEnableUnion() {
        return this.EnableUnion;
    }

    /**
     * Set 是否启用统一域名
     * @param EnableUnion 是否启用统一域名
     */
    public void setEnableUnion(Boolean EnableUnion) {
        this.EnableUnion = EnableUnion;
    }

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 访问类型："OA", "PUBLIC", "MINIAPP", "VPC" （不传默认PUBLIC+MINIAPP+VPC） 
     * @return AccessTypes 访问类型："OA", "PUBLIC", "MINIAPP", "VPC" （不传默认PUBLIC+MINIAPP+VPC）
     */
    public String [] getAccessTypes() {
        return this.AccessTypes;
    }

    /**
     * Set 访问类型："OA", "PUBLIC", "MINIAPP", "VPC" （不传默认PUBLIC+MINIAPP+VPC）
     * @param AccessTypes 访问类型："OA", "PUBLIC", "MINIAPP", "VPC" （不传默认PUBLIC+MINIAPP+VPC）
     */
    public void setAccessTypes(String [] AccessTypes) {
        this.AccessTypes = AccessTypes;
    }

    /**
     * Get 是否开启路径透传，默认true表示短路径，即不开启路径透传(已弃用) 
     * @return IsShortPath 是否开启路径透传，默认true表示短路径，即不开启路径透传(已弃用)
     */
    public Boolean getIsShortPath() {
        return this.IsShortPath;
    }

    /**
     * Set 是否开启路径透传，默认true表示短路径，即不开启路径透传(已弃用)
     * @param IsShortPath 是否开启路径透传，默认true表示短路径，即不开启路径透传(已弃用)
     */
    public void setIsShortPath(Boolean IsShortPath) {
        this.IsShortPath = IsShortPath;
    }

    /**
     * Get 路径透传，默认0关闭，1开启，2关闭 
     * @return PathTransmission 路径透传，默认0关闭，1开启，2关闭
     */
    public Long getPathTransmission() {
        return this.PathTransmission;
    }

    /**
     * Set 路径透传，默认0关闭，1开启，2关闭
     * @param PathTransmission 路径透传，默认0关闭，1开启，2关闭
     */
    public void setPathTransmission(Long PathTransmission) {
        this.PathTransmission = PathTransmission;
    }

    /**
     * Get 跨域校验，默认0开启，1开启，2关闭 
     * @return EnableCheckAcrossDomain 跨域校验，默认0开启，1开启，2关闭
     */
    public Long getEnableCheckAcrossDomain() {
        return this.EnableCheckAcrossDomain;
    }

    /**
     * Set 跨域校验，默认0开启，1开启，2关闭
     * @param EnableCheckAcrossDomain 跨域校验，默认0开启，1开启，2关闭
     */
    public void setEnableCheckAcrossDomain(Long EnableCheckAcrossDomain) {
        this.EnableCheckAcrossDomain = EnableCheckAcrossDomain;
    }

    /**
     * Get 静态托管资源目录 
     * @return StaticFileDirectory 静态托管资源目录
     */
    public String getStaticFileDirectory() {
        return this.StaticFileDirectory;
    }

    /**
     * Set 静态托管资源目录
     * @param StaticFileDirectory 静态托管资源目录
     */
    public void setStaticFileDirectory(String StaticFileDirectory) {
        this.StaticFileDirectory = StaticFileDirectory;
    }

    public CreateCloudBaseGWAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudBaseGWAPIRequest(CreateCloudBaseGWAPIRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.APIId != null) {
            this.APIId = new String(source.APIId);
        }
        if (source.Custom != null) {
            this.Custom = new String(source.Custom);
        }
        if (source.AuthSwitch != null) {
            this.AuthSwitch = new Long(source.AuthSwitch);
        }
        if (source.EnableRegion != null) {
            this.EnableRegion = new Boolean(source.EnableRegion);
        }
        if (source.EnableUnion != null) {
            this.EnableUnion = new Boolean(source.EnableUnion);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AccessTypes != null) {
            this.AccessTypes = new String[source.AccessTypes.length];
            for (int i = 0; i < source.AccessTypes.length; i++) {
                this.AccessTypes[i] = new String(source.AccessTypes[i]);
            }
        }
        if (source.IsShortPath != null) {
            this.IsShortPath = new Boolean(source.IsShortPath);
        }
        if (source.PathTransmission != null) {
            this.PathTransmission = new Long(source.PathTransmission);
        }
        if (source.EnableCheckAcrossDomain != null) {
            this.EnableCheckAcrossDomain = new Long(source.EnableCheckAcrossDomain);
        }
        if (source.StaticFileDirectory != null) {
            this.StaticFileDirectory = new String(source.StaticFileDirectory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "APIId", this.APIId);
        this.setParamSimple(map, prefix + "Custom", this.Custom);
        this.setParamSimple(map, prefix + "AuthSwitch", this.AuthSwitch);
        this.setParamSimple(map, prefix + "EnableRegion", this.EnableRegion);
        this.setParamSimple(map, prefix + "EnableUnion", this.EnableUnion);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "AccessTypes.", this.AccessTypes);
        this.setParamSimple(map, prefix + "IsShortPath", this.IsShortPath);
        this.setParamSimple(map, prefix + "PathTransmission", this.PathTransmission);
        this.setParamSimple(map, prefix + "EnableCheckAcrossDomain", this.EnableCheckAcrossDomain);
        this.setParamSimple(map, prefix + "StaticFileDirectory", this.StaticFileDirectory);

    }
}

