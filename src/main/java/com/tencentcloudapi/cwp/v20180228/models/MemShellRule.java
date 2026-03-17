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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MemShellRule extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 客户端ID
    */
    @SerializedName("UuidHostips")
    @Expose
    private UuidHostip [] UuidHostips;

    /**
    * 逻辑运算符，0: 下面5个有效的正则逻辑与 1: 逻辑或
    */
    @SerializedName("LogicalSymbol")
    @Expose
    private Long LogicalSymbol;

    /**
    * 类名正则表达式，为空则不匹配
    */
    @SerializedName("ClassNameRegexp")
    @Expose
    private String ClassNameRegexp;

    /**
    * 父类名正则表达式，为空则不匹配
    */
    @SerializedName("SuperClassNameRegexp")
    @Expose
    private String SuperClassNameRegexp;

    /**
    * 继承的接口正则表达式，为空则不匹配
    */
    @SerializedName("InterfacesRegexp")
    @Expose
    private String InterfacesRegexp;

    /**
    * 注释正则表达式，为空则不匹配
    */
    @SerializedName("AnnotationsRegexp")
    @Expose
    private String AnnotationsRegexp;

    /**
    * 所属的类加载器正则表达式，为空则不匹配
    */
    @SerializedName("LoaderClassNameRegexp")
    @Expose
    private String LoaderClassNameRegexp;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 是否全局规则(是否对appid下所有主机有效， 0:单台uuid 1:全局，默认否)
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 状态 (0: 有效 1: 删除，2：无效（启用开关关闭）)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 处理历史事件， 0:不处理 1:处理
    */
    @SerializedName("HandleHistory")
    @Expose
    private Long HandleHistory;

    /**
    * 批次id
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
    * 应用资产，描述服务器数量，全局时候为：全部服务器
    */
    @SerializedName("MachinesNums")
    @Expose
    private String MachinesNums;

    /**
    * 策略名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 源代码正则表达式，为空则不匹配
    */
    @SerializedName("CodeSourceRegexp")
    @Expose
    private String CodeSourceRegexp;

    /**
    * 调用栈正则表达式，为空则不匹配
    */
    @SerializedName("CallStackRegexp")
    @Expose
    private String CallStackRegexp;

    /**
    * 文件是否存在， 0:用户没选择规则时候的默认值，1：文件存在，2：文件不存在
    */
    @SerializedName("FileExist")
    @Expose
    private Long FileExist;

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 客户端ID 
     * @return UuidHostips 客户端ID
     */
    public UuidHostip [] getUuidHostips() {
        return this.UuidHostips;
    }

    /**
     * Set 客户端ID
     * @param UuidHostips 客户端ID
     */
    public void setUuidHostips(UuidHostip [] UuidHostips) {
        this.UuidHostips = UuidHostips;
    }

    /**
     * Get 逻辑运算符，0: 下面5个有效的正则逻辑与 1: 逻辑或 
     * @return LogicalSymbol 逻辑运算符，0: 下面5个有效的正则逻辑与 1: 逻辑或
     */
    public Long getLogicalSymbol() {
        return this.LogicalSymbol;
    }

    /**
     * Set 逻辑运算符，0: 下面5个有效的正则逻辑与 1: 逻辑或
     * @param LogicalSymbol 逻辑运算符，0: 下面5个有效的正则逻辑与 1: 逻辑或
     */
    public void setLogicalSymbol(Long LogicalSymbol) {
        this.LogicalSymbol = LogicalSymbol;
    }

    /**
     * Get 类名正则表达式，为空则不匹配 
     * @return ClassNameRegexp 类名正则表达式，为空则不匹配
     */
    public String getClassNameRegexp() {
        return this.ClassNameRegexp;
    }

    /**
     * Set 类名正则表达式，为空则不匹配
     * @param ClassNameRegexp 类名正则表达式，为空则不匹配
     */
    public void setClassNameRegexp(String ClassNameRegexp) {
        this.ClassNameRegexp = ClassNameRegexp;
    }

    /**
     * Get 父类名正则表达式，为空则不匹配 
     * @return SuperClassNameRegexp 父类名正则表达式，为空则不匹配
     */
    public String getSuperClassNameRegexp() {
        return this.SuperClassNameRegexp;
    }

    /**
     * Set 父类名正则表达式，为空则不匹配
     * @param SuperClassNameRegexp 父类名正则表达式，为空则不匹配
     */
    public void setSuperClassNameRegexp(String SuperClassNameRegexp) {
        this.SuperClassNameRegexp = SuperClassNameRegexp;
    }

    /**
     * Get 继承的接口正则表达式，为空则不匹配 
     * @return InterfacesRegexp 继承的接口正则表达式，为空则不匹配
     */
    public String getInterfacesRegexp() {
        return this.InterfacesRegexp;
    }

    /**
     * Set 继承的接口正则表达式，为空则不匹配
     * @param InterfacesRegexp 继承的接口正则表达式，为空则不匹配
     */
    public void setInterfacesRegexp(String InterfacesRegexp) {
        this.InterfacesRegexp = InterfacesRegexp;
    }

    /**
     * Get 注释正则表达式，为空则不匹配 
     * @return AnnotationsRegexp 注释正则表达式，为空则不匹配
     */
    public String getAnnotationsRegexp() {
        return this.AnnotationsRegexp;
    }

    /**
     * Set 注释正则表达式，为空则不匹配
     * @param AnnotationsRegexp 注释正则表达式，为空则不匹配
     */
    public void setAnnotationsRegexp(String AnnotationsRegexp) {
        this.AnnotationsRegexp = AnnotationsRegexp;
    }

    /**
     * Get 所属的类加载器正则表达式，为空则不匹配 
     * @return LoaderClassNameRegexp 所属的类加载器正则表达式，为空则不匹配
     */
    public String getLoaderClassNameRegexp() {
        return this.LoaderClassNameRegexp;
    }

    /**
     * Set 所属的类加载器正则表达式，为空则不匹配
     * @param LoaderClassNameRegexp 所属的类加载器正则表达式，为空则不匹配
     */
    public void setLoaderClassNameRegexp(String LoaderClassNameRegexp) {
        this.LoaderClassNameRegexp = LoaderClassNameRegexp;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 是否全局规则(是否对appid下所有主机有效， 0:单台uuid 1:全局，默认否) 
     * @return IsGlobal 是否全局规则(是否对appid下所有主机有效， 0:单台uuid 1:全局，默认否)
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set 是否全局规则(是否对appid下所有主机有效， 0:单台uuid 1:全局，默认否)
     * @param IsGlobal 是否全局规则(是否对appid下所有主机有效， 0:单台uuid 1:全局，默认否)
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get 状态 (0: 有效 1: 删除，2：无效（启用开关关闭）) 
     * @return Status 状态 (0: 有效 1: 删除，2：无效（启用开关关闭）)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 (0: 有效 1: 删除，2：无效（启用开关关闭）)
     * @param Status 状态 (0: 有效 1: 删除，2：无效（启用开关关闭）)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 处理历史事件， 0:不处理 1:处理 
     * @return HandleHistory 处理历史事件， 0:不处理 1:处理
     */
    public Long getHandleHistory() {
        return this.HandleHistory;
    }

    /**
     * Set 处理历史事件， 0:不处理 1:处理
     * @param HandleHistory 处理历史事件， 0:不处理 1:处理
     */
    public void setHandleHistory(Long HandleHistory) {
        this.HandleHistory = HandleHistory;
    }

    /**
     * Get 批次id 
     * @return GroupID 批次id
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set 批次id
     * @param GroupID 批次id
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    /**
     * Get 应用资产，描述服务器数量，全局时候为：全部服务器 
     * @return MachinesNums 应用资产，描述服务器数量，全局时候为：全部服务器
     */
    public String getMachinesNums() {
        return this.MachinesNums;
    }

    /**
     * Set 应用资产，描述服务器数量，全局时候为：全部服务器
     * @param MachinesNums 应用资产，描述服务器数量，全局时候为：全部服务器
     */
    public void setMachinesNums(String MachinesNums) {
        this.MachinesNums = MachinesNums;
    }

    /**
     * Get 策略名称 
     * @return GroupName 策略名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 策略名称
     * @param GroupName 策略名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 源代码正则表达式，为空则不匹配 
     * @return CodeSourceRegexp 源代码正则表达式，为空则不匹配
     */
    public String getCodeSourceRegexp() {
        return this.CodeSourceRegexp;
    }

    /**
     * Set 源代码正则表达式，为空则不匹配
     * @param CodeSourceRegexp 源代码正则表达式，为空则不匹配
     */
    public void setCodeSourceRegexp(String CodeSourceRegexp) {
        this.CodeSourceRegexp = CodeSourceRegexp;
    }

    /**
     * Get 调用栈正则表达式，为空则不匹配 
     * @return CallStackRegexp 调用栈正则表达式，为空则不匹配
     */
    public String getCallStackRegexp() {
        return this.CallStackRegexp;
    }

    /**
     * Set 调用栈正则表达式，为空则不匹配
     * @param CallStackRegexp 调用栈正则表达式，为空则不匹配
     */
    public void setCallStackRegexp(String CallStackRegexp) {
        this.CallStackRegexp = CallStackRegexp;
    }

    /**
     * Get 文件是否存在， 0:用户没选择规则时候的默认值，1：文件存在，2：文件不存在 
     * @return FileExist 文件是否存在， 0:用户没选择规则时候的默认值，1：文件存在，2：文件不存在
     */
    public Long getFileExist() {
        return this.FileExist;
    }

    /**
     * Set 文件是否存在， 0:用户没选择规则时候的默认值，1：文件存在，2：文件不存在
     * @param FileExist 文件是否存在， 0:用户没选择规则时候的默认值，1：文件存在，2：文件不存在
     */
    public void setFileExist(Long FileExist) {
        this.FileExist = FileExist;
    }

    public MemShellRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MemShellRule(MemShellRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UuidHostips != null) {
            this.UuidHostips = new UuidHostip[source.UuidHostips.length];
            for (int i = 0; i < source.UuidHostips.length; i++) {
                this.UuidHostips[i] = new UuidHostip(source.UuidHostips[i]);
            }
        }
        if (source.LogicalSymbol != null) {
            this.LogicalSymbol = new Long(source.LogicalSymbol);
        }
        if (source.ClassNameRegexp != null) {
            this.ClassNameRegexp = new String(source.ClassNameRegexp);
        }
        if (source.SuperClassNameRegexp != null) {
            this.SuperClassNameRegexp = new String(source.SuperClassNameRegexp);
        }
        if (source.InterfacesRegexp != null) {
            this.InterfacesRegexp = new String(source.InterfacesRegexp);
        }
        if (source.AnnotationsRegexp != null) {
            this.AnnotationsRegexp = new String(source.AnnotationsRegexp);
        }
        if (source.LoaderClassNameRegexp != null) {
            this.LoaderClassNameRegexp = new String(source.LoaderClassNameRegexp);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.HandleHistory != null) {
            this.HandleHistory = new Long(source.HandleHistory);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
        if (source.MachinesNums != null) {
            this.MachinesNums = new String(source.MachinesNums);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.CodeSourceRegexp != null) {
            this.CodeSourceRegexp = new String(source.CodeSourceRegexp);
        }
        if (source.CallStackRegexp != null) {
            this.CallStackRegexp = new String(source.CallStackRegexp);
        }
        if (source.FileExist != null) {
            this.FileExist = new Long(source.FileExist);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "UuidHostips.", this.UuidHostips);
        this.setParamSimple(map, prefix + "LogicalSymbol", this.LogicalSymbol);
        this.setParamSimple(map, prefix + "ClassNameRegexp", this.ClassNameRegexp);
        this.setParamSimple(map, prefix + "SuperClassNameRegexp", this.SuperClassNameRegexp);
        this.setParamSimple(map, prefix + "InterfacesRegexp", this.InterfacesRegexp);
        this.setParamSimple(map, prefix + "AnnotationsRegexp", this.AnnotationsRegexp);
        this.setParamSimple(map, prefix + "LoaderClassNameRegexp", this.LoaderClassNameRegexp);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "HandleHistory", this.HandleHistory);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "MachinesNums", this.MachinesNums);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "CodeSourceRegexp", this.CodeSourceRegexp);
        this.setParamSimple(map, prefix + "CallStackRegexp", this.CallStackRegexp);
        this.setParamSimple(map, prefix + "FileExist", this.FileExist);

    }
}

