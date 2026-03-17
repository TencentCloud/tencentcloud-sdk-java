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

public class YDRaspBlackWhiteListItem extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

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
    * 白名单类型，rasp:漏洞防御,memshell_scan:内存马扫描, memshell_inject:内存马注入
    */
    @SerializedName("Source")
    @Expose
    private String Source;

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
    * 内存马扫描使用，处理历史事件， 0:不处理 1:处理
    */
    @SerializedName("HandleHistory")
    @Expose
    private Long HandleHistory;

    /**
    * rasp和内存马注入使用，匹配内容，POC，可以是正则表达式（MatchMode=5），也可以是字符串
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * rasp和内存马注入使用，攻击来源ip,不设置就是全部来源，可以多个，可以有ip段，例如：192.168.57.1/24;172.17.0.1
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 规则名称
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * rasp和内存马注入使用，加白方式，0：恶意特征加白，1：请求URL加白
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * rasp和内存马注入使用，攻击类型，vul.rasp_attacktype_mapping attack_type_id字段
    */
    @SerializedName("AttackType")
    @Expose
    private Long AttackType;

    /**
    * rasp和内存马注入使用，匹配模式，0:完全匹配,1：前缀匹配，2：后缀匹配，4：任意匹配，5：部分匹配，6：正则匹配
    */
    @SerializedName("MatchMode")
    @Expose
    private Long MatchMode;

    /**
    * 生效资产类型，0: 主机不生效 1: 主机生效
    */
    @SerializedName("CWPEffective")
    @Expose
    private Long CWPEffective;

    /**
    * 0: 一组quuid 1: 所有主机授权的机器
    */
    @SerializedName("CWPScope")
    @Expose
    private Long CWPScope;

    /**
    * 指定生效主机机器
    */
    @SerializedName("CWPQuuids")
    @Expose
    private String [] CWPQuuids;

    /**
    * 生效资产类型，0: 容器不生效 1: 容器生效
    */
    @SerializedName("TCSSEffective")
    @Expose
    private Long TCSSEffective;

    /**
    * 0: 一组quuid 1: 所有容器授权的node
    */
    @SerializedName("TCSSScope")
    @Expose
    private Long TCSSScope;

    /**
    * 指定生效容器节点
    */
    @SerializedName("TCSSQuuids")
    @Expose
    private String [] TCSSQuuids;

    /**
    * 生效资产类型，0: 超级节点不生效 1: 超级节点生效
    */
    @SerializedName("EksEffective")
    @Expose
    private Long EksEffective;

    /**
    * 0: 一组quuid 1: 所有容器授权的超级节点
    */
    @SerializedName("EksScope")
    @Expose
    private Long EksScope;

    /**
    * 指定生效容器超级节点
    */
    @SerializedName("EksNodeUniqueID")
    @Expose
    private String [] EksNodeUniqueID;

    /**
    * 应用资产，全局则：全部主机，否则是选择主机服务器的数量
    */
    @SerializedName("CWPMachinesNums")
    @Expose
    private String CWPMachinesNums;

    /**
    * 应用资产，全局则：全部容器主机节点，否则是选择容器主机节点的数量
    */
    @SerializedName("TCSSMachinesNums")
    @Expose
    private String TCSSMachinesNums;

    /**
    * 应用资产，全局则：全部超级节点，否则是选择超级节点的数量
    */
    @SerializedName("EksMachinesNums")
    @Expose
    private String EksMachinesNums;

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
     * Get 白名单类型，rasp:漏洞防御,memshell_scan:内存马扫描, memshell_inject:内存马注入 
     * @return Source 白名单类型，rasp:漏洞防御,memshell_scan:内存马扫描, memshell_inject:内存马注入
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 白名单类型，rasp:漏洞防御,memshell_scan:内存马扫描, memshell_inject:内存马注入
     * @param Source 白名单类型，rasp:漏洞防御,memshell_scan:内存马扫描, memshell_inject:内存马注入
     */
    public void setSource(String Source) {
        this.Source = Source;
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
     * Get 内存马扫描使用，处理历史事件， 0:不处理 1:处理 
     * @return HandleHistory 内存马扫描使用，处理历史事件， 0:不处理 1:处理
     */
    public Long getHandleHistory() {
        return this.HandleHistory;
    }

    /**
     * Set 内存马扫描使用，处理历史事件， 0:不处理 1:处理
     * @param HandleHistory 内存马扫描使用，处理历史事件， 0:不处理 1:处理
     */
    public void setHandleHistory(Long HandleHistory) {
        this.HandleHistory = HandleHistory;
    }

    /**
     * Get rasp和内存马注入使用，匹配内容，POC，可以是正则表达式（MatchMode=5），也可以是字符串 
     * @return Content rasp和内存马注入使用，匹配内容，POC，可以是正则表达式（MatchMode=5），也可以是字符串
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set rasp和内存马注入使用，匹配内容，POC，可以是正则表达式（MatchMode=5），也可以是字符串
     * @param Content rasp和内存马注入使用，匹配内容，POC，可以是正则表达式（MatchMode=5），也可以是字符串
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get rasp和内存马注入使用，攻击来源ip,不设置就是全部来源，可以多个，可以有ip段，例如：192.168.57.1/24;172.17.0.1 
     * @return IP rasp和内存马注入使用，攻击来源ip,不设置就是全部来源，可以多个，可以有ip段，例如：192.168.57.1/24;172.17.0.1
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set rasp和内存马注入使用，攻击来源ip,不设置就是全部来源，可以多个，可以有ip段，例如：192.168.57.1/24;172.17.0.1
     * @param IP rasp和内存马注入使用，攻击来源ip,不设置就是全部来源，可以多个，可以有ip段，例如：192.168.57.1/24;172.17.0.1
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 规则名称 
     * @return PolicyName 规则名称
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 规则名称
     * @param PolicyName 规则名称
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get rasp和内存马注入使用，加白方式，0：恶意特征加白，1：请求URL加白 
     * @return FilterType rasp和内存马注入使用，加白方式，0：恶意特征加白，1：请求URL加白
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set rasp和内存马注入使用，加白方式，0：恶意特征加白，1：请求URL加白
     * @param FilterType rasp和内存马注入使用，加白方式，0：恶意特征加白，1：请求URL加白
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get rasp和内存马注入使用，攻击类型，vul.rasp_attacktype_mapping attack_type_id字段 
     * @return AttackType rasp和内存马注入使用，攻击类型，vul.rasp_attacktype_mapping attack_type_id字段
     */
    public Long getAttackType() {
        return this.AttackType;
    }

    /**
     * Set rasp和内存马注入使用，攻击类型，vul.rasp_attacktype_mapping attack_type_id字段
     * @param AttackType rasp和内存马注入使用，攻击类型，vul.rasp_attacktype_mapping attack_type_id字段
     */
    public void setAttackType(Long AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get rasp和内存马注入使用，匹配模式，0:完全匹配,1：前缀匹配，2：后缀匹配，4：任意匹配，5：部分匹配，6：正则匹配 
     * @return MatchMode rasp和内存马注入使用，匹配模式，0:完全匹配,1：前缀匹配，2：后缀匹配，4：任意匹配，5：部分匹配，6：正则匹配
     */
    public Long getMatchMode() {
        return this.MatchMode;
    }

    /**
     * Set rasp和内存马注入使用，匹配模式，0:完全匹配,1：前缀匹配，2：后缀匹配，4：任意匹配，5：部分匹配，6：正则匹配
     * @param MatchMode rasp和内存马注入使用，匹配模式，0:完全匹配,1：前缀匹配，2：后缀匹配，4：任意匹配，5：部分匹配，6：正则匹配
     */
    public void setMatchMode(Long MatchMode) {
        this.MatchMode = MatchMode;
    }

    /**
     * Get 生效资产类型，0: 主机不生效 1: 主机生效 
     * @return CWPEffective 生效资产类型，0: 主机不生效 1: 主机生效
     */
    public Long getCWPEffective() {
        return this.CWPEffective;
    }

    /**
     * Set 生效资产类型，0: 主机不生效 1: 主机生效
     * @param CWPEffective 生效资产类型，0: 主机不生效 1: 主机生效
     */
    public void setCWPEffective(Long CWPEffective) {
        this.CWPEffective = CWPEffective;
    }

    /**
     * Get 0: 一组quuid 1: 所有主机授权的机器 
     * @return CWPScope 0: 一组quuid 1: 所有主机授权的机器
     */
    public Long getCWPScope() {
        return this.CWPScope;
    }

    /**
     * Set 0: 一组quuid 1: 所有主机授权的机器
     * @param CWPScope 0: 一组quuid 1: 所有主机授权的机器
     */
    public void setCWPScope(Long CWPScope) {
        this.CWPScope = CWPScope;
    }

    /**
     * Get 指定生效主机机器 
     * @return CWPQuuids 指定生效主机机器
     */
    public String [] getCWPQuuids() {
        return this.CWPQuuids;
    }

    /**
     * Set 指定生效主机机器
     * @param CWPQuuids 指定生效主机机器
     */
    public void setCWPQuuids(String [] CWPQuuids) {
        this.CWPQuuids = CWPQuuids;
    }

    /**
     * Get 生效资产类型，0: 容器不生效 1: 容器生效 
     * @return TCSSEffective 生效资产类型，0: 容器不生效 1: 容器生效
     */
    public Long getTCSSEffective() {
        return this.TCSSEffective;
    }

    /**
     * Set 生效资产类型，0: 容器不生效 1: 容器生效
     * @param TCSSEffective 生效资产类型，0: 容器不生效 1: 容器生效
     */
    public void setTCSSEffective(Long TCSSEffective) {
        this.TCSSEffective = TCSSEffective;
    }

    /**
     * Get 0: 一组quuid 1: 所有容器授权的node 
     * @return TCSSScope 0: 一组quuid 1: 所有容器授权的node
     */
    public Long getTCSSScope() {
        return this.TCSSScope;
    }

    /**
     * Set 0: 一组quuid 1: 所有容器授权的node
     * @param TCSSScope 0: 一组quuid 1: 所有容器授权的node
     */
    public void setTCSSScope(Long TCSSScope) {
        this.TCSSScope = TCSSScope;
    }

    /**
     * Get 指定生效容器节点 
     * @return TCSSQuuids 指定生效容器节点
     */
    public String [] getTCSSQuuids() {
        return this.TCSSQuuids;
    }

    /**
     * Set 指定生效容器节点
     * @param TCSSQuuids 指定生效容器节点
     */
    public void setTCSSQuuids(String [] TCSSQuuids) {
        this.TCSSQuuids = TCSSQuuids;
    }

    /**
     * Get 生效资产类型，0: 超级节点不生效 1: 超级节点生效 
     * @return EksEffective 生效资产类型，0: 超级节点不生效 1: 超级节点生效
     */
    public Long getEksEffective() {
        return this.EksEffective;
    }

    /**
     * Set 生效资产类型，0: 超级节点不生效 1: 超级节点生效
     * @param EksEffective 生效资产类型，0: 超级节点不生效 1: 超级节点生效
     */
    public void setEksEffective(Long EksEffective) {
        this.EksEffective = EksEffective;
    }

    /**
     * Get 0: 一组quuid 1: 所有容器授权的超级节点 
     * @return EksScope 0: 一组quuid 1: 所有容器授权的超级节点
     */
    public Long getEksScope() {
        return this.EksScope;
    }

    /**
     * Set 0: 一组quuid 1: 所有容器授权的超级节点
     * @param EksScope 0: 一组quuid 1: 所有容器授权的超级节点
     */
    public void setEksScope(Long EksScope) {
        this.EksScope = EksScope;
    }

    /**
     * Get 指定生效容器超级节点 
     * @return EksNodeUniqueID 指定生效容器超级节点
     */
    public String [] getEksNodeUniqueID() {
        return this.EksNodeUniqueID;
    }

    /**
     * Set 指定生效容器超级节点
     * @param EksNodeUniqueID 指定生效容器超级节点
     */
    public void setEksNodeUniqueID(String [] EksNodeUniqueID) {
        this.EksNodeUniqueID = EksNodeUniqueID;
    }

    /**
     * Get 应用资产，全局则：全部主机，否则是选择主机服务器的数量 
     * @return CWPMachinesNums 应用资产，全局则：全部主机，否则是选择主机服务器的数量
     */
    public String getCWPMachinesNums() {
        return this.CWPMachinesNums;
    }

    /**
     * Set 应用资产，全局则：全部主机，否则是选择主机服务器的数量
     * @param CWPMachinesNums 应用资产，全局则：全部主机，否则是选择主机服务器的数量
     */
    public void setCWPMachinesNums(String CWPMachinesNums) {
        this.CWPMachinesNums = CWPMachinesNums;
    }

    /**
     * Get 应用资产，全局则：全部容器主机节点，否则是选择容器主机节点的数量 
     * @return TCSSMachinesNums 应用资产，全局则：全部容器主机节点，否则是选择容器主机节点的数量
     */
    public String getTCSSMachinesNums() {
        return this.TCSSMachinesNums;
    }

    /**
     * Set 应用资产，全局则：全部容器主机节点，否则是选择容器主机节点的数量
     * @param TCSSMachinesNums 应用资产，全局则：全部容器主机节点，否则是选择容器主机节点的数量
     */
    public void setTCSSMachinesNums(String TCSSMachinesNums) {
        this.TCSSMachinesNums = TCSSMachinesNums;
    }

    /**
     * Get 应用资产，全局则：全部超级节点，否则是选择超级节点的数量 
     * @return EksMachinesNums 应用资产，全局则：全部超级节点，否则是选择超级节点的数量
     */
    public String getEksMachinesNums() {
        return this.EksMachinesNums;
    }

    /**
     * Set 应用资产，全局则：全部超级节点，否则是选择超级节点的数量
     * @param EksMachinesNums 应用资产，全局则：全部超级节点，否则是选择超级节点的数量
     */
    public void setEksMachinesNums(String EksMachinesNums) {
        this.EksMachinesNums = EksMachinesNums;
    }

    public YDRaspBlackWhiteListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public YDRaspBlackWhiteListItem(YDRaspBlackWhiteListItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
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
        if (source.Source != null) {
            this.Source = new String(source.Source);
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
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.FilterType != null) {
            this.FilterType = new Long(source.FilterType);
        }
        if (source.AttackType != null) {
            this.AttackType = new Long(source.AttackType);
        }
        if (source.MatchMode != null) {
            this.MatchMode = new Long(source.MatchMode);
        }
        if (source.CWPEffective != null) {
            this.CWPEffective = new Long(source.CWPEffective);
        }
        if (source.CWPScope != null) {
            this.CWPScope = new Long(source.CWPScope);
        }
        if (source.CWPQuuids != null) {
            this.CWPQuuids = new String[source.CWPQuuids.length];
            for (int i = 0; i < source.CWPQuuids.length; i++) {
                this.CWPQuuids[i] = new String(source.CWPQuuids[i]);
            }
        }
        if (source.TCSSEffective != null) {
            this.TCSSEffective = new Long(source.TCSSEffective);
        }
        if (source.TCSSScope != null) {
            this.TCSSScope = new Long(source.TCSSScope);
        }
        if (source.TCSSQuuids != null) {
            this.TCSSQuuids = new String[source.TCSSQuuids.length];
            for (int i = 0; i < source.TCSSQuuids.length; i++) {
                this.TCSSQuuids[i] = new String(source.TCSSQuuids[i]);
            }
        }
        if (source.EksEffective != null) {
            this.EksEffective = new Long(source.EksEffective);
        }
        if (source.EksScope != null) {
            this.EksScope = new Long(source.EksScope);
        }
        if (source.EksNodeUniqueID != null) {
            this.EksNodeUniqueID = new String[source.EksNodeUniqueID.length];
            for (int i = 0; i < source.EksNodeUniqueID.length; i++) {
                this.EksNodeUniqueID[i] = new String(source.EksNodeUniqueID[i]);
            }
        }
        if (source.CWPMachinesNums != null) {
            this.CWPMachinesNums = new String(source.CWPMachinesNums);
        }
        if (source.TCSSMachinesNums != null) {
            this.TCSSMachinesNums = new String(source.TCSSMachinesNums);
        }
        if (source.EksMachinesNums != null) {
            this.EksMachinesNums = new String(source.EksMachinesNums);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "LogicalSymbol", this.LogicalSymbol);
        this.setParamSimple(map, prefix + "ClassNameRegexp", this.ClassNameRegexp);
        this.setParamSimple(map, prefix + "SuperClassNameRegexp", this.SuperClassNameRegexp);
        this.setParamSimple(map, prefix + "InterfacesRegexp", this.InterfacesRegexp);
        this.setParamSimple(map, prefix + "AnnotationsRegexp", this.AnnotationsRegexp);
        this.setParamSimple(map, prefix + "LoaderClassNameRegexp", this.LoaderClassNameRegexp);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "HandleHistory", this.HandleHistory);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamSimple(map, prefix + "MatchMode", this.MatchMode);
        this.setParamSimple(map, prefix + "CWPEffective", this.CWPEffective);
        this.setParamSimple(map, prefix + "CWPScope", this.CWPScope);
        this.setParamArraySimple(map, prefix + "CWPQuuids.", this.CWPQuuids);
        this.setParamSimple(map, prefix + "TCSSEffective", this.TCSSEffective);
        this.setParamSimple(map, prefix + "TCSSScope", this.TCSSScope);
        this.setParamArraySimple(map, prefix + "TCSSQuuids.", this.TCSSQuuids);
        this.setParamSimple(map, prefix + "EksEffective", this.EksEffective);
        this.setParamSimple(map, prefix + "EksScope", this.EksScope);
        this.setParamArraySimple(map, prefix + "EksNodeUniqueID.", this.EksNodeUniqueID);
        this.setParamSimple(map, prefix + "CWPMachinesNums", this.CWPMachinesNums);
        this.setParamSimple(map, prefix + "TCSSMachinesNums", this.TCSSMachinesNums);
        this.setParamSimple(map, prefix + "EksMachinesNums", this.EksMachinesNums);

    }
}

